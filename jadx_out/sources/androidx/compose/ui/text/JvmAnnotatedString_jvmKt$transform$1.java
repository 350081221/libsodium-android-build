package androidx.compose.ui.text;

import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "invoke", "(Ljava/util/List;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmKt$transform$1 extends n0 implements l<List<? extends Integer>, Integer> {
    final /* synthetic */ Map<Integer, Integer> $offsetMap;
    final /* synthetic */ k1.h<String> $resultStr;
    final /* synthetic */ AnnotatedString $this_transform;
    final /* synthetic */ q<String, Integer, Integer, String> $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JvmAnnotatedString_jvmKt$transform$1(k1.h<String> hVar, q<? super String, ? super Integer, ? super Integer, String> qVar, AnnotatedString annotatedString, Map<Integer, Integer> map) {
        super(1);
        this.$resultStr = hVar;
        this.$transform = qVar;
        this.$this_transform = annotatedString;
        this.$offsetMap = map;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    @m
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Integer invoke2(@p4.l List<Integer> list) {
        int intValue = list.get(0).intValue();
        int intValue2 = list.get(1).intValue();
        this.$resultStr.element = this.$resultStr.element + this.$transform.invoke(this.$this_transform.getText(), Integer.valueOf(intValue), Integer.valueOf(intValue2));
        return this.$offsetMap.put(Integer.valueOf(intValue2), Integer.valueOf(this.$resultStr.element.length()));
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Integer invoke(List<? extends Integer> list) {
        return invoke2((List<Integer>) list);
    }
}
