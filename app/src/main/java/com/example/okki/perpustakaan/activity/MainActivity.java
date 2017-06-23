package com.example.okki.perpustakaan.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.okki.perpustakaan.R;
import com.example.okki.perpustakaan.fragment.BerandaFragment;
import com.example.okki.perpustakaan.fragment.PendaftaranFragment;
import com.example.okki.perpustakaan.fragment.PengembalianFragment;
import com.example.okki.perpustakaan.fragment.PinjamFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Fragment fragment = null;
    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("Beranda");
        fragment = new BerandaFragment();
        fragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.frame,fragment)
                .commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.beranda) {
            setTitle("Beranda");
            fragment = new BerandaFragment();
            fragmentManager
                    .beginTransaction()
                    .addToBackStack(null)
                    .replace(R.id.frame,fragment)
                    .commit();
        } else if (id == R.id.user) {
            setTitle("Pendaftran Anggota");
            fragment = new PendaftaranFragment();
            fragmentManager
                    .beginTransaction()
                    .addToBackStack(null)
                    .replace(R.id.frame,fragment)
                    .commit();
        } else if (id == R.id.pinjam) {
            setTitle("Peminjaman Buku");
            fragment = new PinjamFragment();
            fragmentManager
                    .beginTransaction()
                    .addToBackStack(null)
                    .replace(R.id.frame,fragment)
                    .commit();
        } else if (id == R.id.kembali) {
            setTitle("Pengembalian");
            fragment = new PengembalianFragment();
            fragmentManager
                    .beginTransaction()
                    .addToBackStack(null)
                    .replace(R.id.frame,fragment)
                    .commit();
        } else if (id == R.id.logout) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
