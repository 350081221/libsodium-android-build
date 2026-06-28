package com.yuanqi.group.abs.ui;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/* loaded from: classes3.dex */
public abstract class VActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends View> T C(int i5) {
        return (T) findViewById(i5);
    }

    protected org.jdeferred.android.b D() {
        return b.a();
    }

    public void E() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public Fragment F(@IdRes int i5) {
        return getSupportFragmentManager().findFragmentById(i5);
    }

    public void G(@IdRes int i5, Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(i5, fragment).commit();
    }

    public Context getContext() {
        return this;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public Activity r() {
        return this;
    }
}
