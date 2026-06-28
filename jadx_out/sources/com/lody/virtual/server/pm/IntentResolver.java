package com.lody.virtual.server.pm;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.server.pm.parser.VPackage;
import com.lody.virtual.server.pm.parser.VPackage.IntentInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class IntentResolver<F extends VPackage.IntentInfo, R> {
    private static final String TAG = "IntentResolver";
    private static final Comparator sResolvePrioritySorter = new Comparator() { // from class: com.lody.virtual.server.pm.IntentResolver.1
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int priority;
            int priority2;
            if (obj instanceof IntentFilter) {
                priority = ((IntentFilter) obj).getPriority();
                priority2 = ((IntentFilter) obj2).getPriority();
            } else {
                if (!(obj instanceof ResolveInfo)) {
                    return 0;
                }
                ResolveInfo resolveInfo = (ResolveInfo) obj2;
                IntentFilter intentFilter = ((ResolveInfo) obj).filter;
                if (intentFilter == null) {
                    priority = 0;
                } else {
                    priority = intentFilter.getPriority();
                }
                IntentFilter intentFilter2 = resolveInfo.filter;
                if (intentFilter2 == null) {
                    priority2 = 0;
                } else {
                    priority2 = intentFilter2.getPriority();
                }
            }
            if (priority > priority2) {
                return -1;
            }
            if (priority >= priority2) {
                return 0;
            }
            return 1;
        }
    };
    private HashSet<F> mFilters = new HashSet<>();
    private HashMap<String, F[]> mTypeToFilter = new HashMap<>();
    private HashMap<String, F[]> mBaseTypeToFilter = new HashMap<>();
    private HashMap<String, F[]> mWildTypeToFilter = new HashMap<>();
    private HashMap<String, F[]> mSchemeToFilter = new HashMap<>();
    private HashMap<String, F[]> mActionToFilter = new HashMap<>();
    private HashMap<String, F[]> mTypedActionToFilter = new HashMap<>();

    /* loaded from: classes3.dex */
    private class IteratorWrapper implements Iterator<F> {
        private F mCur;
        private Iterator<F> mI;

        IteratorWrapper(Iterator<F> it) {
            this.mI = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mI.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            F f5 = this.mCur;
            if (f5 != null) {
                IntentResolver.this.removeFilterInternal(f5);
            }
            this.mI.remove();
        }

        @Override // java.util.Iterator
        public F next() {
            F next = this.mI.next();
            this.mCur = next;
            return next;
        }
    }

    private void buildResolveList(Intent intent, FastImmutableArraySet<String> fastImmutableArraySet, boolean z4, String str, String str2, F[] fArr, List<R> list, int i5) {
        int i6;
        F f5;
        int match;
        F[] fArr2 = fArr;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str3 = intent.getPackage();
        if (fArr2 != null) {
            i6 = fArr2.length;
        } else {
            i6 = 0;
        }
        int i7 = 0;
        boolean z5 = false;
        while (i7 < i6 && (f5 = fArr2[i7]) != null) {
            if ((str3 == null || isPackageForFilter(str3, f5)) && allowFilterResult(f5, list) && (match = f5.filter.match(action, str, str2, data, fastImmutableArraySet, TAG)) >= 0) {
                if (z4 && !f5.filter.hasCategory("android.intent.category.DEFAULT")) {
                    z5 = true;
                } else {
                    R newResult = newResult(f5, match, i5);
                    if (newResult != null) {
                        list.add(newResult);
                    }
                }
            }
            i7++;
            fArr2 = fArr;
        }
        if (z5) {
            if (list.size() == 0) {
                VLog.w(TAG, "resolveIntent failed: found match, but none with CATEGORY_DEFAULT", new Object[0]);
            } else if (list.size() > 1) {
                VLog.w(TAG, "resolveIntent: multiple matches, only some with CATEGORY_DEFAULT", new Object[0]);
            }
        }
    }

    private ArrayList<F> collectFilters(F[] fArr, IntentFilter intentFilter) {
        F f5;
        ArrayList<F> arrayList = null;
        if (fArr != null) {
            for (int i5 = 0; i5 < fArr.length && (f5 = fArr[i5]) != null; i5++) {
                if (filterEquals(f5.filter, intentFilter)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(f5);
                }
            }
        }
        return arrayList;
    }

    private boolean filterEquals(IntentFilter intentFilter, IntentFilter intentFilter2) {
        int countDataSchemes;
        int countActions = intentFilter.countActions();
        if (countActions != intentFilter2.countActions()) {
            return false;
        }
        for (int i5 = 0; i5 < countActions; i5++) {
            if (!intentFilter2.hasAction(intentFilter.getAction(i5))) {
                return false;
            }
        }
        int countCategories = intentFilter.countCategories();
        if (countCategories != intentFilter2.countCategories()) {
            return false;
        }
        for (int i6 = 0; i6 < countCategories; i6++) {
            if (!intentFilter2.hasCategory(intentFilter.getCategory(i6))) {
                return false;
            }
        }
        if (intentFilter.countDataTypes() != intentFilter2.countDataTypes() || (countDataSchemes = intentFilter.countDataSchemes()) != intentFilter2.countDataSchemes()) {
            return false;
        }
        for (int i7 = 0; i7 < countDataSchemes; i7++) {
            if (!intentFilter2.hasDataScheme(intentFilter.getDataScheme(i7))) {
                return false;
            }
        }
        if (intentFilter.countDataAuthorities() != intentFilter2.countDataAuthorities() || intentFilter.countDataPaths() != intentFilter2.countDataPaths() || intentFilter.countDataSchemeSpecificParts() != intentFilter2.countDataSchemeSpecificParts()) {
            return false;
        }
        return true;
    }

    private static FastImmutableArraySet<String> getFastIntentCategories(Intent intent) {
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            return null;
        }
        return new FastImmutableArraySet<>((String[]) categories.toArray(new String[categories.size()]));
    }

    private int register_intent_filter(F f5, Iterator<String> it, HashMap<String, F[]> hashMap, String str) {
        int i5 = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i5++;
            addFilter(hashMap, it.next(), f5);
        }
        return i5;
    }

    private int register_mime_types(F f5, String str) {
        String str2;
        Iterator<String> typesIterator = f5.filter.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i5 = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i5++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str2 = next.substring(0, indexOf).intern();
            } else {
                str2 = next;
                next = next + "/*";
            }
            addFilter(this.mTypeToFilter, next, f5);
            if (indexOf > 0) {
                addFilter(this.mBaseTypeToFilter, str2, f5);
            } else {
                addFilter(this.mWildTypeToFilter, str2, f5);
            }
        }
        return i5;
    }

    private void remove_all_objects(HashMap<String, F[]> hashMap, String str, Object obj) {
        F[] fArr = hashMap.get(str);
        if (fArr != null) {
            int length = fArr.length - 1;
            while (length >= 0 && fArr[length] == null) {
                length--;
            }
            int i5 = length;
            while (length >= 0) {
                if (fArr[length] == obj) {
                    int i6 = i5 - length;
                    if (i6 > 0) {
                        System.arraycopy(fArr, length + 1, fArr, length, i6);
                    }
                    fArr[i5] = null;
                    i5--;
                }
                length--;
            }
            if (i5 < 0) {
                hashMap.remove(str);
            } else if (i5 < fArr.length / 2) {
                F[] newArray = newArray(i5 + 2);
                System.arraycopy(fArr, 0, newArray, 0, i5 + 1);
                hashMap.put(str, newArray);
            }
        }
    }

    private int unregister_intent_filter(F f5, Iterator<String> it, HashMap<String, F[]> hashMap, String str) {
        int i5 = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i5++;
            remove_all_objects(hashMap, it.next(), f5);
        }
        return i5;
    }

    private int unregister_mime_types(F f5, String str) {
        String str2;
        Iterator<String> typesIterator = f5.filter.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i5 = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i5++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str2 = next.substring(0, indexOf).intern();
            } else {
                str2 = next;
                next = next + "/*";
            }
            remove_all_objects(this.mTypeToFilter, next, f5);
            if (indexOf > 0) {
                remove_all_objects(this.mBaseTypeToFilter, str2, f5);
            } else {
                remove_all_objects(this.mWildTypeToFilter, str2, f5);
            }
        }
        return i5;
    }

    public void addFilter(F f5) {
        this.mFilters.add(f5);
        int register_intent_filter = register_intent_filter(f5, f5.filter.schemesIterator(), this.mSchemeToFilter, "      Scheme: ");
        int register_mime_types = register_mime_types(f5, "      Type: ");
        if (register_intent_filter == 0 && register_mime_types == 0) {
            register_intent_filter(f5, f5.filter.actionsIterator(), this.mActionToFilter, "      Action: ");
        }
        if (register_mime_types != 0) {
            register_intent_filter(f5, f5.filter.actionsIterator(), this.mTypedActionToFilter, "      TypedAction: ");
        }
    }

    protected boolean allowFilterResult(F f5, List<R> list) {
        return true;
    }

    protected void dumpFilter(PrintWriter printWriter, String str, F f5) {
        printWriter.print(str);
        printWriter.println(f5);
    }

    protected void dumpFilterLabel(PrintWriter printWriter, String str, Object obj, int i5) {
        printWriter.print(str);
        printWriter.print(obj);
        printWriter.print(": ");
        printWriter.println(i5);
    }

    public Iterator<F> filterIterator() {
        return new IteratorWrapper(this.mFilters.iterator());
    }

    public Set<F> filterSet() {
        return Collections.unmodifiableSet(this.mFilters);
    }

    protected Object filterToLabel(F f5) {
        return "IntentFilter";
    }

    public ArrayList<F> findFilters(IntentFilter intentFilter) {
        if (intentFilter.countDataSchemes() == 1) {
            return collectFilters(this.mSchemeToFilter.get(intentFilter.getDataScheme(0)), intentFilter);
        }
        if (intentFilter.countDataTypes() != 0 && intentFilter.countActions() == 1) {
            return collectFilters(this.mTypedActionToFilter.get(intentFilter.getAction(0)), intentFilter);
        }
        if (intentFilter.countDataTypes() == 0 && intentFilter.countDataSchemes() == 0 && intentFilter.countActions() == 1) {
            return collectFilters(this.mActionToFilter.get(intentFilter.getAction(0)), intentFilter);
        }
        Iterator<F> it = this.mFilters.iterator();
        ArrayList<F> arrayList = null;
        while (it.hasNext()) {
            F next = it.next();
            if (filterEquals(next.filter, intentFilter)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    protected boolean isFilterStopped(F f5) {
        return false;
    }

    protected abstract boolean isPackageForFilter(String str, F f5);

    protected abstract F[] newArray(int i5);

    /* JADX WARN: Multi-variable type inference failed */
    protected R newResult(F f5, int i5, int i6) {
        return f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<R> queryIntent(android.content.Intent r18, java.lang.String r19, boolean r20, int r21) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.pm.IntentResolver.queryIntent(android.content.Intent, java.lang.String, boolean, int):java.util.List");
    }

    public List<R> queryIntentFromList(Intent intent, String str, boolean z4, ArrayList<F[]> arrayList, int i5) {
        ArrayList arrayList2 = new ArrayList();
        FastImmutableArraySet<String> fastIntentCategories = getFastIntentCategories(intent);
        String scheme = intent.getScheme();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            buildResolveList(intent, fastIntentCategories, z4, str, scheme, arrayList.get(i6), arrayList2, i5);
        }
        sortResults(arrayList2);
        return arrayList2;
    }

    public void removeFilter(F f5) {
        removeFilterInternal(f5);
        this.mFilters.remove(f5);
    }

    void removeFilterInternal(F f5) {
        int unregister_intent_filter = unregister_intent_filter(f5, f5.filter.schemesIterator(), this.mSchemeToFilter, "      Scheme: ");
        int unregister_mime_types = unregister_mime_types(f5, "      Type: ");
        if (unregister_intent_filter == 0 && unregister_mime_types == 0) {
            unregister_intent_filter(f5, f5.filter.actionsIterator(), this.mActionToFilter, "      Action: ");
        }
        if (unregister_mime_types != 0) {
            unregister_intent_filter(f5, f5.filter.actionsIterator(), this.mTypedActionToFilter, "      TypedAction: ");
        }
    }

    protected void sortResults(List<R> list) {
        Collections.sort(list, sResolvePrioritySorter);
    }

    private void addFilter(HashMap<String, F[]> hashMap, String str, F f5) {
        F[] fArr = hashMap.get(str);
        if (fArr == null) {
            F[] newArray = newArray(2);
            hashMap.put(str, newArray);
            newArray[0] = f5;
            return;
        }
        int length = fArr.length;
        int i5 = length;
        while (i5 > 0 && fArr[i5 - 1] == null) {
            i5--;
        }
        if (i5 < length) {
            fArr[i5] = f5;
            return;
        }
        F[] newArray2 = newArray((length * 3) / 2);
        System.arraycopy(fArr, 0, newArray2, 0, length);
        newArray2[length] = f5;
        hashMap.put(str, newArray2);
    }
}
