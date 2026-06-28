package org.greenrobot.greendao.test;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.test.AndroidTestCase;
import androidx.room.RoomMasterTable;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.k0;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.i;

/* loaded from: classes4.dex */
public abstract class d<D extends org.greenrobot.greendao.a<T, K>, T, K> extends b<D, T, K> {

    /* renamed from: k, reason: collision with root package name */
    protected Set<K> f21515k;

    /* renamed from: l, reason: collision with root package name */
    private i f21516l;

    public d(Class<D> cls) {
        super(cls);
        this.f21515k = new HashSet();
    }

    public void A() {
        this.f21511g.deleteAll();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < 15; i5++) {
            arrayList.add(k(n()));
        }
        this.f21511g.insertInTx(arrayList);
        AndroidTestCase.assertEquals(arrayList.size(), this.f21511g.loadAll().size());
    }

    public void B() {
        p(0);
    }

    public void C() {
        p(10);
    }

    public void D() {
        this.f21511g.insert(l());
        K n5 = n();
        this.f21511g.insert(k(n5));
        this.f21511g.insert(l());
        List<T> queryRaw = this.f21511g.queryRaw("WHERE " + this.f21511g.getPkColumns()[0] + "=?", n5.toString());
        AndroidTestCase.assertEquals(1, queryRaw.size());
        AndroidTestCase.assertEquals(n5, this.f21512h.b(queryRaw.get(0)));
    }

    public void E() {
        K n5 = n();
        this.f21511g.insert(k(n5));
        Cursor o5 = o(5, RoomMasterTable.DEFAULT_ID, n5);
        try {
            AndroidTestCase.assertEquals(n5, this.f21512h.b(this.f21512h.e(o5, 5)));
        } finally {
            o5.close();
        }
    }

    public void F() {
        boolean z4;
        if (this.f21511g.insert(l()) != this.f21511g.insert(l())) {
            z4 = true;
        } else {
            z4 = false;
        }
        AndroidTestCase.assertTrue(z4);
    }

    public void G() {
        if (!j()) {
            return;
        }
        this.f21511g.deleteAll();
        T k5 = k(null);
        if (k5 != null) {
            this.f21511g.save(k5);
            this.f21511g.save(k5);
            AndroidTestCase.assertEquals(1L, this.f21511g.count());
        }
    }

    public void H() {
        if (!j()) {
            return;
        }
        this.f21511g.deleteAll();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < 20; i5++) {
            T k5 = k(null);
            if (i5 % 2 == 0) {
                arrayList.add(k5);
            }
            arrayList2.add(k5);
        }
        this.f21511g.saveInTx(arrayList);
        this.f21511g.saveInTx(arrayList2);
        AndroidTestCase.assertEquals(arrayList2.size(), this.f21511g.count());
    }

    public void I() {
        this.f21511g.deleteAll();
        T l5 = l();
        this.f21511g.insert(l5);
        this.f21511g.update(l5);
        AndroidTestCase.assertEquals(1L, this.f21511g.count());
    }

    protected boolean j() {
        if (k(null) == null) {
            org.greenrobot.greendao.e.a("Test is not available for entities with non-null keys");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T k(K k5);

    protected T l() {
        return k(n());
    }

    protected abstract K m();

    protected K n() {
        for (int i5 = 0; i5 < 100000; i5++) {
            K m5 = m();
            if (this.f21515k.add(m5)) {
                return m5;
            }
        }
        throw new IllegalStateException("Could not find a new PK");
    }

    protected Cursor o(int i5, String str, K k5) {
        StringBuilder sb = new StringBuilder("SELECT ");
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(str);
            sb.append(",");
        }
        org.greenrobot.greendao.internal.d.c(sb, "T", this.f21511g.getAllColumns()).append(" FROM ");
        sb.append(k0.f19765b);
        sb.append(this.f21511g.getTablename());
        sb.append(k0.f19765b);
        sb.append(" T");
        if (k5 != null) {
            sb.append(" WHERE ");
            AndroidTestCase.assertEquals(1, this.f21511g.getPkColumns().length);
            sb.append(this.f21511g.getPkColumns()[0]);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            DatabaseUtils.appendValueToSql(sb, k5);
        }
        Cursor b5 = this.f21520c.b(sb.toString(), null);
        AndroidTestCase.assertTrue(b5.moveToFirst());
        for (int i7 = 0; i7 < i5; i7++) {
            try {
                AndroidTestCase.assertEquals(str, b5.getString(i7));
            } catch (RuntimeException e5) {
                b5.close();
                throw e5;
            }
        }
        if (k5 != null) {
            AndroidTestCase.assertEquals(1, b5.getCount());
        }
        return b5;
    }

    protected void p(int i5) {
        K n5 = n();
        this.f21511g.insert(k(n5));
        Cursor o5 = o(i5, RoomMasterTable.DEFAULT_ID, n5);
        try {
            AndroidTestCase.assertEquals(n5, this.f21512h.f(o5, i5));
        } finally {
            o5.close();
        }
    }

    public void q() {
        this.f21511g.deleteAll();
        AndroidTestCase.assertEquals(0L, this.f21511g.count());
        this.f21511g.insert(l());
        AndroidTestCase.assertEquals(1L, this.f21511g.count());
        this.f21511g.insert(l());
        AndroidTestCase.assertEquals(2L, this.f21511g.count());
    }

    public void r() {
        K n5 = n();
        this.f21511g.deleteByKey(n5);
        this.f21511g.insert(k(n5));
        AndroidTestCase.assertNotNull(this.f21511g.load(n5));
        this.f21511g.deleteByKey(n5);
        AndroidTestCase.assertNull(this.f21511g.load(n5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < 10; i5++) {
            arrayList.add(l());
        }
        this.f21511g.insertInTx(arrayList);
        this.f21511g.deleteAll();
        AndroidTestCase.assertEquals(0L, this.f21511g.count());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object b5 = this.f21512h.b(it.next());
            AndroidTestCase.assertNotNull(b5);
            AndroidTestCase.assertNull(this.f21511g.load(b5));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.test.b, org.greenrobot.greendao.test.f
    public void setUp() throws Exception {
        super.setUp();
        for (i iVar : this.f21512h.c()) {
            if (iVar.f21359d) {
                if (this.f21516l == null) {
                    this.f21516l = iVar;
                } else {
                    throw new RuntimeException("Test does not work with multiple PK columns");
                }
            }
        }
        if (this.f21516l == null) {
            throw new RuntimeException("Test does not work without a PK column");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < 10; i5++) {
            arrayList.add(l());
        }
        this.f21511g.insertInTx(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f21512h.b(arrayList.get(0)));
        arrayList2.add(this.f21512h.b(arrayList.get(3)));
        arrayList2.add(this.f21512h.b(arrayList.get(4)));
        arrayList2.add(this.f21512h.b(arrayList.get(8)));
        this.f21511g.deleteByKeyInTx(arrayList2);
        AndroidTestCase.assertEquals(arrayList.size() - arrayList2.size(), this.f21511g.count());
        for (Object obj : arrayList2) {
            AndroidTestCase.assertNotNull(obj);
            AndroidTestCase.assertNull(this.f21511g.load(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void u() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < 10; i5++) {
            arrayList.add(l());
        }
        this.f21511g.insertInTx(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(arrayList.get(0));
        arrayList2.add(arrayList.get(3));
        arrayList2.add(arrayList.get(4));
        arrayList2.add(arrayList.get(8));
        this.f21511g.deleteInTx(arrayList2);
        AndroidTestCase.assertEquals(arrayList.size() - arrayList2.size(), this.f21511g.count());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object b5 = this.f21512h.b(it.next());
            AndroidTestCase.assertNotNull(b5);
            AndroidTestCase.assertNull(this.f21511g.load(b5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v() {
        K n5 = n();
        T k5 = k(n5);
        this.f21511g.insert(k5);
        AndroidTestCase.assertEquals(n5, this.f21512h.b(k5));
        Object load = this.f21511g.load(n5);
        AndroidTestCase.assertNotNull(load);
        AndroidTestCase.assertEquals(this.f21512h.b(k5), this.f21512h.b(load));
    }

    public void w() {
        this.f21511g.deleteAll();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < 20; i5++) {
            arrayList.add(l());
        }
        this.f21511g.insertInTx(arrayList);
        AndroidTestCase.assertEquals(arrayList.size(), this.f21511g.count());
    }

    public void x() {
        this.f21511g.deleteAll();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < 20; i5++) {
            T l5 = l();
            if (i5 % 2 == 0) {
                arrayList.add(l5);
            }
            arrayList2.add(l5);
        }
        this.f21511g.insertOrReplaceInTx(arrayList);
        this.f21511g.insertOrReplaceInTx(arrayList2);
        AndroidTestCase.assertEquals(arrayList2.size(), this.f21511g.count());
    }

    public void y() {
        T l5 = l();
        long insert = this.f21511g.insert(l5);
        long insertOrReplace = this.f21511g.insertOrReplace(l5);
        if (this.f21511g.getPkProperty().f21357b == Long.class) {
            AndroidTestCase.assertEquals(insert, insertOrReplace);
        }
    }

    public void z() {
        T k5 = k(n());
        this.f21511g.insert(k5);
        try {
            this.f21511g.insert(k5);
            AndroidTestCase.fail("Inserting twice should not work");
        } catch (SQLException unused) {
        }
    }
}
