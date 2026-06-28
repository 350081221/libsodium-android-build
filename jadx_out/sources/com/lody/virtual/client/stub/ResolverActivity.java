package com.lody.virtual.client.stub;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.R;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VUserHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

@Instrumented
/* loaded from: classes3.dex */
public class ResolverActivity extends Activity implements AdapterView.OnItemClickListener {
    private static final boolean DEBUG = false;
    private static final String TAG = "ResolverActivity";
    private AlertDialog dialog;
    private ResolveListAdapter mAdapter;
    private Button mAlwaysButton;
    private boolean mAlwaysUseOption;
    private int mIconDpi;
    private int mIconSize;
    private int mLastSelected = -1;
    private int mLaunchedFromUid;
    private ListView mListView;
    private int mMaxColumns;
    private Button mOnceButton;
    protected Bundle mOptions;
    private PackageManager mPm;
    private boolean mRegistered;
    protected int mRequestCode;
    protected IBinder mResultTo;
    protected String mResultWho;
    private boolean mShowExtended;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class DisplayResolveInfo {
        Drawable displayIcon;
        CharSequence displayLabel;
        CharSequence extendedInfo;
        Intent origIntent;
        ResolveInfo ri;

        DisplayResolveInfo(ResolveInfo resolveInfo, CharSequence charSequence, CharSequence charSequence2, Intent intent) {
            this.ri = resolveInfo;
            this.displayLabel = charSequence;
            this.extendedInfo = charSequence2;
            this.origIntent = intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class ItemLongClickListener implements AdapterView.OnItemLongClickListener {
        ItemLongClickListener() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            ResolverActivity.this.showAppDetails(ResolverActivity.this.mAdapter.resolveInfoForPosition(i5));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class LoadIconTask extends AsyncTask<DisplayResolveInfo, Void, DisplayResolveInfo> {
        LoadIconTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public DisplayResolveInfo doInBackground(DisplayResolveInfo... displayResolveInfoArr) {
            DisplayResolveInfo displayResolveInfo = displayResolveInfoArr[0];
            if (displayResolveInfo.displayIcon == null) {
                displayResolveInfo.displayIcon = ResolverActivity.this.loadIconForResolveInfo(displayResolveInfo.ri);
            }
            return displayResolveInfo;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(DisplayResolveInfo displayResolveInfo) {
            ResolverActivity.this.mAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class ResolveListAdapter extends BaseAdapter {
        private final List<ResolveInfo> mBaseResolveList;
        private final LayoutInflater mInflater;
        private final Intent[] mInitialIntents;
        private final Intent mIntent;
        private ResolveInfo mLastChosen;
        private final int mLaunchedFromUid;
        List<ResolveInfo> mOrigResolveList;
        private int mInitialHighlight = -1;
        List<DisplayResolveInfo> mList = new ArrayList();

        public ResolveListAdapter(Context context, Intent intent, Intent[] intentArr, List<ResolveInfo> list, int i5) {
            this.mIntent = new Intent(intent);
            this.mInitialIntents = intentArr;
            this.mBaseResolveList = list;
            this.mLaunchedFromUid = i5;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            rebuildList();
        }

        private final void bindView(View view, DisplayResolveInfo displayResolveInfo) {
            ViewHolder viewHolder = (ViewHolder) view.getTag();
            viewHolder.text.setText(displayResolveInfo.displayLabel);
            if (ResolverActivity.this.mShowExtended) {
                viewHolder.text2.setVisibility(0);
                viewHolder.text2.setText(displayResolveInfo.extendedInfo);
            } else {
                viewHolder.text2.setVisibility(8);
            }
            if (displayResolveInfo.displayIcon == null) {
                new LoadIconTask().execute(displayResolveInfo);
            }
            viewHolder.icon.setImageDrawable(displayResolveInfo.displayIcon);
        }

        private void processGroup(List<ResolveInfo> list, int i5, int i6, ResolveInfo resolveInfo, CharSequence charSequence) {
            boolean z4;
            boolean z5 = true;
            if ((i6 - i5) + 1 == 1) {
                ResolveInfo resolveInfo2 = this.mLastChosen;
                if (resolveInfo2 != null && resolveInfo2.activityInfo.packageName.equals(resolveInfo.activityInfo.packageName) && this.mLastChosen.activityInfo.name.equals(resolveInfo.activityInfo.name)) {
                    this.mInitialHighlight = this.mList.size();
                }
                this.mList.add(new DisplayResolveInfo(resolveInfo, charSequence, null, null));
                return;
            }
            ResolverActivity.this.mShowExtended = true;
            CharSequence loadLabel = resolveInfo.activityInfo.applicationInfo.loadLabel(ResolverActivity.this.mPm);
            if (loadLabel == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                HashSet hashSet = new HashSet();
                hashSet.add(loadLabel);
                int i7 = i5 + 1;
                while (true) {
                    if (i7 <= i6) {
                        CharSequence loadLabel2 = list.get(i7).activityInfo.applicationInfo.loadLabel(ResolverActivity.this.mPm);
                        if (loadLabel2 == null || hashSet.contains(loadLabel2)) {
                            break;
                        }
                        hashSet.add(loadLabel2);
                        i7++;
                    } else {
                        z5 = z4;
                        break;
                    }
                }
                hashSet.clear();
                z4 = z5;
            }
            while (i5 <= i6) {
                ResolveInfo resolveInfo3 = list.get(i5);
                ResolveInfo resolveInfo4 = this.mLastChosen;
                if (resolveInfo4 != null && resolveInfo4.activityInfo.packageName.equals(resolveInfo3.activityInfo.packageName) && this.mLastChosen.activityInfo.name.equals(resolveInfo3.activityInfo.name)) {
                    this.mInitialHighlight = this.mList.size();
                }
                if (z4) {
                    this.mList.add(new DisplayResolveInfo(resolveInfo3, charSequence, resolveInfo3.activityInfo.packageName, null));
                } else {
                    List<DisplayResolveInfo> list2 = this.mList;
                    ResolverActivity resolverActivity = ResolverActivity.this;
                    list2.add(new DisplayResolveInfo(resolveInfo3, charSequence, resolveInfo3.activityInfo.applicationInfo.loadLabel(resolverActivity.mPm), null));
                }
                i5++;
            }
        }

        private void rebuildList() {
            int i5;
            int size;
            this.mList.clear();
            List<ResolveInfo> list = this.mBaseResolveList;
            if (list != null) {
                this.mOrigResolveList = null;
            } else {
                PackageManager packageManager = ResolverActivity.this.mPm;
                Intent intent = this.mIntent;
                if (ResolverActivity.this.mAlwaysUseOption) {
                    i5 = 64;
                } else {
                    i5 = 0;
                }
                list = packageManager.queryIntentActivities(intent, i5 | 65536);
                this.mOrigResolveList = list;
            }
            List<ResolveInfo> list2 = list;
            if (list2 != null && (size = list2.size()) > 0) {
                ResolveInfo resolveInfo = list2.get(0);
                for (int i6 = 1; i6 < size; i6++) {
                    ResolveInfo resolveInfo2 = list2.get(i6);
                    if (resolveInfo.priority != resolveInfo2.priority || resolveInfo.isDefault != resolveInfo2.isDefault) {
                        while (i6 < size) {
                            if (this.mOrigResolveList == list2) {
                                this.mOrigResolveList = new ArrayList(this.mOrigResolveList);
                            }
                            list2.remove(i6);
                            size--;
                        }
                    }
                }
                ListIterator<ResolveInfo> listIterator = list2.listIterator();
                int i7 = size;
                while (listIterator.hasNext()) {
                    ResolveInfo next = listIterator.next();
                    ActivityInfo activityInfo = next.activityInfo;
                    if (activityInfo != null && !TextUtils.isEmpty(activityInfo.permission) && ResolverActivity.this.checkPermission(next.activityInfo.permission, Process.myPid(), Process.myUid()) != 0) {
                        listIterator.remove();
                    } else {
                        ActivityInfo activityInfo2 = next.activityInfo;
                        if (activityInfo2 != null && !activityInfo2.exported) {
                            listIterator.remove();
                        }
                    }
                    i7--;
                }
                if (i7 > 1) {
                    Collections.sort(list2, new ResolveInfo.DisplayNameComparator(ResolverActivity.this.mPm));
                }
                if (this.mInitialIntents != null) {
                    int i8 = 0;
                    while (true) {
                        Intent[] intentArr = this.mInitialIntents;
                        if (i8 >= intentArr.length) {
                            break;
                        }
                        Intent intent2 = intentArr[i8];
                        if (intent2 != null) {
                            ActivityInfo resolveActivityInfo = intent2.resolveActivityInfo(ResolverActivity.this.getPackageManager(), 0);
                            if (resolveActivityInfo == null) {
                                VLog.w(ResolverActivity.TAG, "No activity found for " + intent2, new Object[0]);
                            } else {
                                ResolveInfo resolveInfo3 = new ResolveInfo();
                                resolveInfo3.activityInfo = resolveActivityInfo;
                                if (intent2 instanceof LabeledIntent) {
                                    LabeledIntent labeledIntent = (LabeledIntent) intent2;
                                    resolveInfo3.resolvePackageName = labeledIntent.getSourcePackage();
                                    resolveInfo3.labelRes = labeledIntent.getLabelResource();
                                    resolveInfo3.nonLocalizedLabel = labeledIntent.getNonLocalizedLabel();
                                    resolveInfo3.icon = labeledIntent.getIconResource();
                                }
                                List<DisplayResolveInfo> list3 = this.mList;
                                ResolverActivity resolverActivity = ResolverActivity.this;
                                list3.add(new DisplayResolveInfo(resolveInfo3, resolveInfo3.loadLabel(resolverActivity.getPackageManager()), null, intent2));
                            }
                        }
                        i8++;
                    }
                }
                ResolveInfo resolveInfo4 = list2.get(0);
                CharSequence loadLabel = resolveInfo4.loadLabel(ResolverActivity.this.mPm);
                ResolverActivity.this.mShowExtended = false;
                ResolveInfo resolveInfo5 = resolveInfo4;
                CharSequence charSequence = loadLabel;
                int i9 = 0;
                for (int i10 = 1; i10 < i7; i10++) {
                    if (charSequence == null) {
                        charSequence = resolveInfo5.activityInfo.packageName;
                    }
                    ResolveInfo resolveInfo6 = list2.get(i10);
                    CharSequence loadLabel2 = resolveInfo6.loadLabel(ResolverActivity.this.mPm);
                    if (loadLabel2 == null) {
                        loadLabel2 = resolveInfo6.activityInfo.packageName;
                    }
                    CharSequence charSequence2 = loadLabel2;
                    if (!charSequence2.equals(charSequence)) {
                        processGroup(list2, i9, i10 - 1, resolveInfo5, charSequence);
                        i9 = i10;
                        resolveInfo5 = resolveInfo6;
                        charSequence = charSequence2;
                    }
                }
                processGroup(list2, i9, i7 - 1, resolveInfo5, charSequence);
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.mList.size();
        }

        public int getInitialHighlight() {
            return this.mInitialHighlight;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i5) {
            return this.mList.get(i5);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i5) {
            return i5;
        }

        @Override // android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.mInflater.inflate(R.layout.resolve_list_item, viewGroup, false);
                ViewHolder viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
                ViewGroup.LayoutParams layoutParams = viewHolder.icon.getLayoutParams();
                int i6 = ResolverActivity.this.mIconSize;
                layoutParams.height = i6;
                layoutParams.width = i6;
            }
            bindView(view, this.mList.get(i5));
            return view;
        }

        public void handlePackagesChanged() {
            getCount();
            rebuildList();
            notifyDataSetChanged();
            if (getCount() == 0) {
                ResolverActivity.this.finish();
            }
        }

        public Intent intentForPosition(int i5) {
            DisplayResolveInfo displayResolveInfo = this.mList.get(i5);
            Intent intent = displayResolveInfo.origIntent;
            if (intent == null) {
                intent = this.mIntent;
            }
            Intent intent2 = new Intent(intent);
            intent2.addFlags(50331648);
            ActivityInfo activityInfo = displayResolveInfo.ri.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            return intent2;
        }

        public ResolveInfo resolveInfoForPosition(int i5) {
            return this.mList.get(i5).ri;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ViewHolder {
        public ImageView icon;
        public TextView text;
        public TextView text2;

        public ViewHolder(View view) {
            this.text = (TextView) view.findViewById(R.id.text1);
            this.text2 = (TextView) view.findViewById(R.id.text2);
            this.icon = (ImageView) view.findViewById(R.id.icon);
        }
    }

    private Intent makeMyIntent() {
        Intent intent = new Intent(getIntent());
        intent.setComponent(null);
        intent.setFlags(intent.getFlags() & (-8388609));
        return intent;
    }

    @TargetApi(15)
    Drawable getIcon(Resources resources, int i5) {
        try {
            return resources.getDrawableForDensity(i5, this.mIconDpi);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    Drawable loadIconForResolveInfo(ResolveInfo resolveInfo) {
        String str;
        Drawable icon;
        try {
            str = resolveInfo.resolvePackageName;
        } catch (PackageManager.NameNotFoundException e5) {
            VLog.e(TAG, "Couldn't find resources for package\n" + VLog.getStackTraceString(e5));
        }
        if (str != null && resolveInfo.icon != 0 && (icon = getIcon(this.mPm.getResourcesForApplication(str), resolveInfo.icon)) != null) {
            return icon;
        }
        int iconResource = resolveInfo.getIconResource();
        if (iconResource != 0) {
            Drawable icon2 = getIcon(this.mPm.getResourcesForApplication(resolveInfo.activityInfo.packageName), iconResource);
            if (icon2 != null) {
                return icon2;
            }
        }
        return resolveInfo.loadIcon(this.mPm);
    }

    @Override // android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    protected void onCreate(Bundle bundle) {
        int i5;
        TraceManager.startActivityTrace(getClass().getName());
        Intent makeMyIntent = makeMyIntent();
        Set<String> categories = makeMyIntent.getCategories();
        if ("android.intent.action.MAIN".equals(makeMyIntent.getAction()) && categories != null && categories.size() == 1 && categories.contains("android.intent.category.HOME")) {
            i5 = R.string.choose;
        } else {
            i5 = R.string.choose;
        }
        onCreate(bundle, makeMyIntent, getResources().getText(i5), null, null, true, makeMyIntent.getIntExtra(Constants.EXTRA_USER_HANDLE, VUserHandle.getCallingUserId()));
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        AlertDialog alertDialog = this.dialog;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.dialog.dismiss();
        }
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        if (r1.hasNext() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        r5 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        if (r5.match(r2) < 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        r1 = r5.getPort();
        r5 = r5.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        if (r1 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
    
        r3 = java.lang.Integer.toString(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ee, code lost:
    
        r0.addDataAuthority(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
    
        r11 = r11.filter.pathsIterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
    
        if (r11 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f9, code lost:
    
        r1 = r2.getPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
    
        if (r1 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
    
        if (r11.hasNext() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
    
        r2 = r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        if (r2.match(r1) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0111, code lost:
    
        r0.addDataPath(r2.getPath(), r2.getType());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onIntentSelected(android.content.pm.ResolveInfo r11, android.content.Intent r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.stub.ResolverActivity.onIntentSelected(android.content.pm.ResolveInfo, android.content.Intent, boolean):void");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
        boolean z4;
        int checkedItemPosition = this.mListView.getCheckedItemPosition();
        if (checkedItemPosition != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.mAlwaysUseOption && (!z4 || this.mLastSelected != checkedItemPosition)) {
            this.mAlwaysButton.setEnabled(z4);
            this.mOnceButton.setEnabled(z4);
            if (z4) {
                this.mListView.smoothScrollToPosition(checkedItemPosition);
            }
            this.mLastSelected = checkedItemPosition;
            return;
        }
        startSelected(i5, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        if (!this.mRegistered) {
            this.mRegistered = true;
        }
        this.mAdapter.handlePackagesChanged();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        boolean z4;
        super.onRestoreInstanceState(bundle);
        if (this.mAlwaysUseOption) {
            int checkedItemPosition = this.mListView.getCheckedItemPosition();
            if (checkedItemPosition != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.mLastSelected = checkedItemPosition;
            this.mAlwaysButton.setEnabled(z4);
            this.mOnceButton.setEnabled(z4);
            if (z4) {
                this.mListView.setSelection(checkedItemPosition);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.mRegistered) {
            this.mRegistered = false;
        }
        if ((getIntent().getFlags() & 268435456) != 0 && !isChangingConfigurations()) {
            finish();
        }
    }

    void showAppDetails(ResolveInfo resolveInfo) {
        startActivity(new Intent().setAction("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", resolveInfo.activityInfo.packageName, null)).addFlags(524288));
    }

    void startSelected(int i5, boolean z4) {
        if (isFinishing()) {
            return;
        }
        onIntentSelected(this.mAdapter.resolveInfoForPosition(i5), this.mAdapter.intentForPosition(i5), z4);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreate(Bundle bundle, Intent intent, CharSequence charSequence, Intent[] intentArr, List<ResolveInfo> list, boolean z4, int i5) {
        super.onCreate(bundle);
        this.mLaunchedFromUid = i5;
        this.mPm = getPackageManager();
        this.mAlwaysUseOption = z4;
        this.mMaxColumns = getResources().getInteger(R.integer.config_maxResolverActivityColumns);
        this.mRegistered = true;
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        this.mIconDpi = activityManager.getLauncherLargeIconDensity();
        this.mIconSize = activityManager.getLauncherLargeIconSize();
        ResolveListAdapter resolveListAdapter = new ResolveListAdapter(this, intent, intentArr, list, this.mLaunchedFromUid);
        this.mAdapter = resolveListAdapter;
        int count = resolveListAdapter.getCount();
        if (this.mLaunchedFromUid < 0) {
            finish();
            return;
        }
        if (count == 1) {
            startSelected(0, false);
            this.mRegistered = false;
            finish();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(charSequence);
        if (count > 1) {
            ListView listView = new ListView(this);
            this.mListView = listView;
            listView.setAdapter((ListAdapter) this.mAdapter);
            this.mListView.setOnItemClickListener(this);
            this.mListView.setOnItemLongClickListener(new ItemLongClickListener());
            builder.setView(this.mListView);
            if (z4) {
                this.mListView.setChoiceMode(1);
            }
        } else {
            builder.setMessage(R.string.noApplications);
        }
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.lody.virtual.client.stub.ResolverActivity.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                ResolverActivity.this.finish();
            }
        });
        this.dialog = builder.show();
    }
}
