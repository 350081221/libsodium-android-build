package kotlin.ranges;

import androidx.compose.ui.layout.LayoutKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.NoSuchElementException;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.a;
import kotlin.ranges.j;
import kotlin.ranges.m;
import kotlin.v2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000t\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0087\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\u0010\"\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\tH\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\nH\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\bH\u0087\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0087\n¢\u0006\u0002\u0010$\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\nH\u0087\n\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060%2\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\u00052\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020**\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\b2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\n2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\f\u0010+\u001a\u00020\u0018*\u00020*H\u0007\u001a\f\u0010+\u001a\u00020\b*\u00020'H\u0007\u001a\f\u0010+\u001a\u00020\t*\u00020)H\u0007\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\b*\u00020'H\u0007¢\u0006\u0002\u0010.\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\t*\u00020)H\u0007¢\u0006\u0002\u0010/\u001a\f\u00100\u001a\u00020\u0018*\u00020*H\u0007\u001a\f\u00100\u001a\u00020\b*\u00020'H\u0007\u001a\f\u00100\u001a\u00020\t*\u00020)H\u0007\u001a\u0013\u00101\u001a\u0004\u0018\u00010\u0018*\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u00101\u001a\u0004\u0018\u00010\b*\u00020'H\u0007¢\u0006\u0002\u0010.\u001a\u0013\u00101\u001a\u0004\u0018\u00010\t*\u00020)H\u0007¢\u0006\u0002\u0010/\u001a\r\u00102\u001a\u00020\u0018*\u00020\u0016H\u0087\b\u001a\u0014\u00102\u001a\u00020\u0018*\u00020\u00162\u0006\u00102\u001a\u000203H\u0007\u001a\r\u00102\u001a\u00020\b*\u00020!H\u0087\b\u001a\u0014\u00102\u001a\u00020\b*\u00020!2\u0006\u00102\u001a\u000203H\u0007\u001a\r\u00102\u001a\u00020\t*\u00020#H\u0087\b\u001a\u0014\u00102\u001a\u00020\t*\u00020#2\u0006\u00102\u001a\u000203H\u0007\u001a\u0014\u00104\u001a\u0004\u0018\u00010\u0018*\u00020\u0016H\u0087\b¢\u0006\u0002\u00105\u001a\u001b\u00104\u001a\u0004\u0018\u00010\u0018*\u00020\u00162\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00106\u001a\u0014\u00104\u001a\u0004\u0018\u00010\b*\u00020!H\u0087\b¢\u0006\u0002\u00107\u001a\u001b\u00104\u001a\u0004\u0018\u00010\b*\u00020!2\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00108\u001a\u0014\u00104\u001a\u0004\u0018\u00010\t*\u00020#H\u0087\b¢\u0006\u0002\u00109\u001a\u001b\u00104\u001a\u0004\u0018\u00010\t*\u00020#2\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u0010:\u001a\n\u0010;\u001a\u00020**\u00020*\u001a\n\u0010;\u001a\u00020'*\u00020'\u001a\n\u0010;\u001a\u00020)*\u00020)\u001a\u0015\u0010<\u001a\u00020**\u00020*2\u0006\u0010<\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010<\u001a\u00020'*\u00020'2\u0006\u0010<\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010<\u001a\u00020)*\u00020)2\u0006\u0010<\u001a\u00020\tH\u0086\u0004\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u0010?\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u0010A\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u0010B\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u0010D\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u0010E\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u0010F\u001a\u0013\u0010G\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u0010H\u001a\u0013\u0010G\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010I\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010K\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010L\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010M\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010N\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\u00052\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020\u0016*\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\b2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\n2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0086\u0004¨\u0006P"}, d2 = {"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", t0.b.f22420d, "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "Lkotlin/ranges/OpenEndRange;", "downTo", "Lkotlin/ranges/IntProgression;", TypedValues.TransitionType.S_TO, "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "first", "firstOrNull", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "last", "lastOrNull", "random", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
@r1({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
/* loaded from: classes4.dex */
public class u extends t {
    public static float A(float f5, float f6) {
        return f5 > f6 ? f6 : f5;
    }

    @g1(version = "1.7")
    @p4.m
    public static final Integer A0(@p4.l j jVar) {
        l0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.e());
    }

    @p4.l
    public static final a A1(@p4.l a aVar, int i5) {
        boolean z4;
        l0.p(aVar, "<this>");
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        t.a(z4, Integer.valueOf(i5));
        a.C0560a c0560a = a.f19524d;
        char e5 = aVar.e();
        char g5 = aVar.g();
        if (aVar.i() <= 0) {
            i5 = -i5;
        }
        return c0560a.a(e5, g5, i5);
    }

    public static int B(int i5, int i6) {
        return i5 > i6 ? i6 : i5;
    }

    @g1(version = "1.7")
    @p4.m
    public static final Long B0(@p4.l m mVar) {
        l0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.e());
    }

    @p4.l
    public static j B1(@p4.l j jVar, int i5) {
        boolean z4;
        l0.p(jVar, "<this>");
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        t.a(z4, Integer.valueOf(i5));
        j.a aVar = j.f19544d;
        int e5 = jVar.e();
        int g5 = jVar.g();
        if (jVar.i() <= 0) {
            i5 = -i5;
        }
        return aVar.a(e5, g5, i5);
    }

    public static long C(long j5, long j6) {
        return j5 > j6 ? j6 : j5;
    }

    @u3.h(name = "floatRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean C0(g gVar, byte b5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(b5));
    }

    @p4.l
    public static final m C1(@p4.l m mVar, long j5) {
        boolean z4;
        l0.p(mVar, "<this>");
        if (j5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        t.a(z4, Long.valueOf(j5));
        m.a aVar = m.f19554d;
        long e5 = mVar.e();
        long g5 = mVar.g();
        if (mVar.i() <= 0) {
            j5 = -j5;
        }
        return aVar.a(e5, g5, j5);
    }

    @p4.l
    public static <T extends Comparable<? super T>> T D(@p4.l T t5, @p4.l T maximumValue) {
        l0.p(t5, "<this>");
        l0.p(maximumValue, "maximumValue");
        if (t5.compareTo(maximumValue) > 0) {
            return maximumValue;
        }
        return t5;
    }

    @u3.h(name = "floatRangeContains")
    public static final boolean D0(@p4.l g<Float> gVar, double d5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf((float) d5));
    }

    @p4.m
    public static final Byte D1(double d5) {
        boolean z4 = false;
        if (-128.0d <= d5 && d5 <= 127.0d) {
            z4 = true;
        }
        if (z4) {
            return Byte.valueOf((byte) d5);
        }
        return null;
    }

    public static final short E(short s5, short s6) {
        return s5 > s6 ? s6 : s5;
    }

    @u3.h(name = "floatRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean E0(g gVar, int i5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(i5));
    }

    @p4.m
    public static final Byte E1(float f5) {
        boolean z4 = false;
        if (-128.0f <= f5 && f5 <= 127.0f) {
            z4 = true;
        }
        if (z4) {
            return Byte.valueOf((byte) f5);
        }
        return null;
    }

    public static final byte F(byte b5, byte b6, byte b7) {
        if (b6 <= b7) {
            return b5 < b6 ? b6 : b5 > b7 ? b7 : b5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b7) + " is less than minimum " + ((int) b6) + external.org.apache.commons.lang3.d.f15957a);
    }

    @u3.h(name = "floatRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean F0(g gVar, long j5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf((float) j5));
    }

    @p4.m
    public static final Byte F1(int i5) {
        if (new l(o0.a.f20834g, 127).l(i5)) {
            return Byte.valueOf((byte) i5);
        }
        return null;
    }

    public static double G(double d5, double d6, double d7) {
        if (d6 <= d7) {
            return d5 < d6 ? d6 : d5 > d7 ? d7 : d5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d7 + " is less than minimum " + d6 + external.org.apache.commons.lang3.d.f15957a);
    }

    @u3.h(name = "floatRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean G0(g gVar, short s5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(s5));
    }

    @p4.m
    public static final Byte G1(long j5) {
        if (new o(-128L, 127L).l(j5)) {
            return Byte.valueOf((byte) j5);
        }
        return null;
    }

    public static float H(float f5, float f6, float f7) {
        if (f6 <= f7) {
            return f5 < f6 ? f6 : f5 > f7 ? f7 : f5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f7 + " is less than minimum " + f6 + external.org.apache.commons.lang3.d.f15957a);
    }

    @u3.h(name = "intRangeContains")
    public static final boolean H0(@p4.l g<Integer> gVar, byte b5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Integer.valueOf(b5));
    }

    @p4.m
    public static final Byte H1(short s5) {
        if (L0(new l(o0.a.f20834g, 127), s5)) {
            return Byte.valueOf((byte) s5);
        }
        return null;
    }

    public static int I(int i5, int i6, int i7) {
        if (i6 <= i7) {
            return i5 < i6 ? i6 : i5 > i7 ? i7 : i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i7 + " is less than minimum " + i6 + external.org.apache.commons.lang3.d.f15957a);
    }

    @u3.h(name = "intRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean I0(g gVar, double d5) {
        l0.p(gVar, "<this>");
        Integer I1 = I1(d5);
        if (I1 != null) {
            return gVar.contains(I1);
        }
        return false;
    }

    @p4.m
    public static final Integer I1(double d5) {
        boolean z4 = false;
        if (-2.147483648E9d <= d5 && d5 <= 2.147483647E9d) {
            z4 = true;
        }
        if (z4) {
            return Integer.valueOf((int) d5);
        }
        return null;
    }

    public static int J(int i5, @p4.l g<Integer> range) {
        Object N;
        l0.p(range, "range");
        if (range instanceof f) {
            N = N(Integer.valueOf(i5), (f) range);
            return ((Number) N).intValue();
        }
        if (!range.isEmpty()) {
            if (i5 < range.getStart().intValue()) {
                return range.getStart().intValue();
            }
            if (i5 > range.getEndInclusive().intValue()) {
                return range.getEndInclusive().intValue();
            }
            return i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + external.org.apache.commons.lang3.d.f15957a);
    }

    @u3.h(name = "intRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean J0(g gVar, float f5) {
        l0.p(gVar, "<this>");
        Integer J1 = J1(f5);
        if (J1 != null) {
            return gVar.contains(J1);
        }
        return false;
    }

    @p4.m
    public static final Integer J1(float f5) {
        boolean z4 = false;
        if (-2.14748365E9f <= f5 && f5 <= 2.14748365E9f) {
            z4 = true;
        }
        if (z4) {
            return Integer.valueOf((int) f5);
        }
        return null;
    }

    public static long K(long j5, long j6, long j7) {
        if (j6 <= j7) {
            return j5 < j6 ? j6 : j5 > j7 ? j7 : j5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j7 + " is less than minimum " + j6 + external.org.apache.commons.lang3.d.f15957a);
    }

    @u3.h(name = "intRangeContains")
    public static boolean K0(@p4.l g<Integer> gVar, long j5) {
        l0.p(gVar, "<this>");
        Integer K1 = K1(j5);
        if (K1 != null) {
            return gVar.contains(K1);
        }
        return false;
    }

    @p4.m
    public static final Integer K1(long j5) {
        if (new o(-2147483648L, 2147483647L).l(j5)) {
            return Integer.valueOf((int) j5);
        }
        return null;
    }

    public static long L(long j5, @p4.l g<Long> range) {
        Object N;
        l0.p(range, "range");
        if (range instanceof f) {
            N = N(Long.valueOf(j5), (f) range);
            return ((Number) N).longValue();
        }
        if (!range.isEmpty()) {
            if (j5 < range.getStart().longValue()) {
                return range.getStart().longValue();
            }
            if (j5 > range.getEndInclusive().longValue()) {
                return range.getEndInclusive().longValue();
            }
            return j5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + external.org.apache.commons.lang3.d.f15957a);
    }

    @u3.h(name = "intRangeContains")
    public static final boolean L0(@p4.l g<Integer> gVar, short s5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Integer.valueOf(s5));
    }

    @p4.m
    public static final Long L1(double d5) {
        boolean z4 = false;
        if (-9.223372036854776E18d <= d5 && d5 <= 9.223372036854776E18d) {
            z4 = true;
        }
        if (z4) {
            return Long.valueOf((long) d5);
        }
        return null;
    }

    @p4.l
    public static <T extends Comparable<? super T>> T M(@p4.l T t5, @p4.m T t6, @p4.m T t7) {
        l0.p(t5, "<this>");
        if (t6 != null && t7 != null) {
            if (t6.compareTo(t7) <= 0) {
                if (t5.compareTo(t6) < 0) {
                    return t6;
                }
                if (t5.compareTo(t7) > 0) {
                    return t7;
                }
            } else {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t7 + " is less than minimum " + t6 + external.org.apache.commons.lang3.d.f15957a);
            }
        } else {
            if (t6 != null && t5.compareTo(t6) < 0) {
                return t6;
            }
            if (t7 != null && t5.compareTo(t7) > 0) {
                return t7;
            }
        }
        return t5;
    }

    @u3.h(name = "intRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean M0(@p4.l r<Integer> rVar, byte b5) {
        l0.p(rVar, "<this>");
        return rVar.contains(Integer.valueOf(b5));
    }

    @p4.m
    public static final Long M1(float f5) {
        boolean z4 = false;
        if (-9.223372E18f <= f5 && f5 <= 9.223372E18f) {
            z4 = true;
        }
        if (z4) {
            return Long.valueOf(f5);
        }
        return null;
    }

    @p4.l
    @g1(version = "1.1")
    public static <T extends Comparable<? super T>> T N(@p4.l T t5, @p4.l f<T> range) {
        l0.p(t5, "<this>");
        l0.p(range, "range");
        if (!range.isEmpty()) {
            if (range.a(t5, range.getStart()) && !range.a(range.getStart(), t5)) {
                return range.getStart();
            }
            if (range.a(range.getEndInclusive(), t5) && !range.a(t5, range.getEndInclusive())) {
                return range.getEndInclusive();
            }
            return t5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + external.org.apache.commons.lang3.d.f15957a);
    }

    @u3.h(name = "intRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean N0(@p4.l r<Integer> rVar, long j5) {
        l0.p(rVar, "<this>");
        Integer K1 = K1(j5);
        if (K1 != null) {
            return rVar.contains(K1);
        }
        return false;
    }

    @p4.m
    public static final Short N1(double d5) {
        boolean z4 = false;
        if (-32768.0d <= d5 && d5 <= 32767.0d) {
            z4 = true;
        }
        if (z4) {
            return Short.valueOf((short) d5);
        }
        return null;
    }

    @p4.l
    public static final <T extends Comparable<? super T>> T O(@p4.l T t5, @p4.l g<T> range) {
        Comparable N;
        l0.p(t5, "<this>");
        l0.p(range, "range");
        if (range instanceof f) {
            N = N(t5, (f) range);
            return (T) N;
        }
        if (!range.isEmpty()) {
            if (t5.compareTo(range.getStart()) < 0) {
                return range.getStart();
            }
            if (t5.compareTo(range.getEndInclusive()) > 0) {
                return range.getEndInclusive();
            }
            return t5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + external.org.apache.commons.lang3.d.f15957a);
    }

    @u3.h(name = "intRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean O0(@p4.l r<Integer> rVar, short s5) {
        l0.p(rVar, "<this>");
        return rVar.contains(Integer.valueOf(s5));
    }

    @p4.m
    public static final Short O1(float f5) {
        boolean z4 = false;
        if (-32768.0f <= f5 && f5 <= 32767.0f) {
            z4 = true;
        }
        if (z4) {
            return Short.valueOf((short) f5);
        }
        return null;
    }

    public static final short P(short s5, short s6, short s7) {
        if (s6 <= s7) {
            return s5 < s6 ? s6 : s5 > s7 ? s7 : s5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s7) + " is less than minimum " + ((int) s6) + external.org.apache.commons.lang3.d.f15957a);
    }

    @g1(version = "1.7")
    public static final char P0(@p4.l a aVar) {
        l0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.g();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @p4.m
    public static final Short P1(int i5) {
        if (new l(-32768, LayoutKt.LargeDimension).l(i5)) {
            return Short.valueOf((short) i5);
        }
        return null;
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final boolean Q(c cVar, Character ch) {
        l0.p(cVar, "<this>");
        if (ch != null && cVar.l(ch.charValue())) {
            return true;
        }
        return false;
    }

    @g1(version = "1.7")
    public static final int Q0(@p4.l j jVar) {
        l0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.g();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @p4.m
    public static final Short Q1(long j5) {
        if (new o(-32768L, 32767L).l(j5)) {
            return Short.valueOf((short) j5);
        }
        return null;
    }

    @kotlin.internal.f
    private static final boolean R(l lVar, byte b5) {
        l0.p(lVar, "<this>");
        return H0(lVar, b5);
    }

    @g1(version = "1.7")
    public static final long R0(@p4.l m mVar) {
        l0.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.g();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @p4.l
    public static final c R1(char c5, char c6) {
        if (l0.t(c6, 0) <= 0) {
            return c.f19534e.a();
        }
        return new c(c5, (char) (c6 - 1));
    }

    @kotlin.internal.f
    private static final boolean S(l lVar, long j5) {
        boolean K0;
        l0.p(lVar, "<this>");
        K0 = K0(lVar, j5);
        return K0;
    }

    @g1(version = "1.7")
    @p4.m
    public static final Character S0(@p4.l a aVar) {
        l0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.g());
    }

    @p4.l
    public static final l S1(byte b5, byte b6) {
        return new l(b5, b6 - 1);
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final boolean T(l lVar, Integer num) {
        l0.p(lVar, "<this>");
        if (num != null && lVar.l(num.intValue())) {
            return true;
        }
        return false;
    }

    @g1(version = "1.7")
    @p4.m
    public static final Integer T0(@p4.l j jVar) {
        l0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.g());
    }

    @p4.l
    public static final l T1(byte b5, int i5) {
        if (i5 <= Integer.MIN_VALUE) {
            return l.f19552e.a();
        }
        return new l(b5, i5 - 1);
    }

    @kotlin.internal.f
    private static final boolean U(l lVar, short s5) {
        l0.p(lVar, "<this>");
        return L0(lVar, s5);
    }

    @g1(version = "1.7")
    @p4.m
    public static final Long U0(@p4.l m mVar) {
        l0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.g());
    }

    @p4.l
    public static final l U1(byte b5, short s5) {
        return new l(b5, s5 - 1);
    }

    @kotlin.internal.f
    private static final boolean V(o oVar, byte b5) {
        l0.p(oVar, "<this>");
        return V0(oVar, b5);
    }

    @u3.h(name = "longRangeContains")
    public static final boolean V0(@p4.l g<Long> gVar, byte b5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Long.valueOf(b5));
    }

    @p4.l
    public static final l V1(int i5, byte b5) {
        return new l(i5, b5 - 1);
    }

    @kotlin.internal.f
    private static final boolean W(o oVar, int i5) {
        l0.p(oVar, "<this>");
        return Y0(oVar, i5);
    }

    @u3.h(name = "longRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean W0(g gVar, double d5) {
        l0.p(gVar, "<this>");
        Long L1 = L1(d5);
        if (L1 != null) {
            return gVar.contains(L1);
        }
        return false;
    }

    @p4.l
    public static l W1(int i5, int i6) {
        if (i6 <= Integer.MIN_VALUE) {
            return l.f19552e.a();
        }
        return new l(i5, i6 - 1);
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final boolean X(o oVar, Long l5) {
        l0.p(oVar, "<this>");
        if (l5 != null && oVar.l(l5.longValue())) {
            return true;
        }
        return false;
    }

    @u3.h(name = "longRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean X0(g gVar, float f5) {
        l0.p(gVar, "<this>");
        Long M1 = M1(f5);
        if (M1 != null) {
            return gVar.contains(M1);
        }
        return false;
    }

    @p4.l
    public static final l X1(int i5, short s5) {
        return new l(i5, s5 - 1);
    }

    @kotlin.internal.f
    private static final boolean Y(o oVar, short s5) {
        l0.p(oVar, "<this>");
        return Z0(oVar, s5);
    }

    @u3.h(name = "longRangeContains")
    public static final boolean Y0(@p4.l g<Long> gVar, int i5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Long.valueOf(i5));
    }

    @p4.l
    public static final l Y1(short s5, byte b5) {
        return new l(s5, b5 - 1);
    }

    @u3.h(name = "doubleRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean Z(g gVar, byte b5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(b5));
    }

    @u3.h(name = "longRangeContains")
    public static final boolean Z0(@p4.l g<Long> gVar, short s5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Long.valueOf(s5));
    }

    @p4.l
    public static final l Z1(short s5, int i5) {
        if (i5 <= Integer.MIN_VALUE) {
            return l.f19552e.a();
        }
        return new l(s5, i5 - 1);
    }

    @u3.h(name = "doubleRangeContains")
    public static final boolean a0(@p4.l g<Double> gVar, float f5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(f5));
    }

    @u3.h(name = "longRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean a1(@p4.l r<Long> rVar, byte b5) {
        l0.p(rVar, "<this>");
        return rVar.contains(Long.valueOf(b5));
    }

    @p4.l
    public static final l a2(short s5, short s6) {
        return new l(s5, s6 - 1);
    }

    @u3.h(name = "doubleRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean b0(g gVar, int i5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(i5));
    }

    @u3.h(name = "longRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean b1(@p4.l r<Long> rVar, int i5) {
        l0.p(rVar, "<this>");
        return rVar.contains(Long.valueOf(i5));
    }

    @p4.l
    public static final o b2(byte b5, long j5) {
        if (j5 <= Long.MIN_VALUE) {
            return o.f19562e.a();
        }
        return new o(b5, j5 - 1);
    }

    @u3.h(name = "doubleRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean c0(g gVar, long j5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(j5));
    }

    @u3.h(name = "longRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean c1(@p4.l r<Long> rVar, short s5) {
        l0.p(rVar, "<this>");
        return rVar.contains(Long.valueOf(s5));
    }

    @p4.l
    public static final o c2(int i5, long j5) {
        if (j5 <= Long.MIN_VALUE) {
            return o.f19562e.a();
        }
        return new o(i5, j5 - 1);
    }

    @u3.h(name = "doubleRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean d0(g gVar, short s5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(s5));
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final char d1(c cVar) {
        l0.p(cVar, "<this>");
        return e1(cVar, kotlin.random.f.Default);
    }

    @p4.l
    public static final o d2(long j5, byte b5) {
        return new o(j5, b5 - 1);
    }

    @u3.h(name = "doubleRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean e0(@p4.l r<Double> rVar, float f5) {
        l0.p(rVar, "<this>");
        return rVar.contains(Double.valueOf(f5));
    }

    @g1(version = "1.3")
    public static final char e1(@p4.l c cVar, @p4.l kotlin.random.f random) {
        l0.p(cVar, "<this>");
        l0.p(random, "random");
        try {
            return (char) random.nextInt(cVar.e(), cVar.g() + 1);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @p4.l
    public static final o e2(long j5, int i5) {
        return new o(j5, i5 - 1);
    }

    @p4.l
    public static final a f0(char c5, char c6) {
        return a.f19524d.a(c5, c6, -1);
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final int f1(l lVar) {
        l0.p(lVar, "<this>");
        return g1(lVar, kotlin.random.f.Default);
    }

    @p4.l
    public static final o f2(long j5, long j6) {
        if (j6 <= Long.MIN_VALUE) {
            return o.f19562e.a();
        }
        return new o(j5, j6 - 1);
    }

    @p4.l
    public static final j g0(byte b5, byte b6) {
        return j.f19544d.a(b5, b6, -1);
    }

    @g1(version = "1.3")
    public static final int g1(@p4.l l lVar, @p4.l kotlin.random.f random) {
        l0.p(lVar, "<this>");
        l0.p(random, "random");
        try {
            return kotlin.random.g.h(random, lVar);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @p4.l
    public static final o g2(long j5, short s5) {
        return new o(j5, s5 - 1);
    }

    @p4.l
    public static final j h0(byte b5, int i5) {
        return j.f19544d.a(b5, i5, -1);
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final long h1(o oVar) {
        l0.p(oVar, "<this>");
        return i1(oVar, kotlin.random.f.Default);
    }

    @p4.l
    public static final o h2(short s5, long j5) {
        if (j5 <= Long.MIN_VALUE) {
            return o.f19562e.a();
        }
        return new o(s5, j5 - 1);
    }

    @p4.l
    public static final j i0(byte b5, short s5) {
        return j.f19544d.a(b5, s5, -1);
    }

    @g1(version = "1.3")
    public static final long i1(@p4.l o oVar, @p4.l kotlin.random.f random) {
        l0.p(oVar, "<this>");
        l0.p(random, "random");
        try {
            return kotlin.random.g.i(random, oVar);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @u3.h(name = "byteRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean j(g gVar, double d5) {
        l0.p(gVar, "<this>");
        Byte D1 = D1(d5);
        if (D1 != null) {
            return gVar.contains(D1);
        }
        return false;
    }

    @p4.l
    public static final j j0(int i5, byte b5) {
        return j.f19544d.a(i5, b5, -1);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final Character j1(c cVar) {
        l0.p(cVar, "<this>");
        return k1(cVar, kotlin.random.f.Default);
    }

    @u3.h(name = "byteRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean k(g gVar, float f5) {
        l0.p(gVar, "<this>");
        Byte E1 = E1(f5);
        if (E1 != null) {
            return gVar.contains(E1);
        }
        return false;
    }

    @p4.l
    public static j k0(int i5, int i6) {
        return j.f19544d.a(i5, i6, -1);
    }

    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    @p4.m
    public static final Character k1(@p4.l c cVar, @p4.l kotlin.random.f random) {
        l0.p(cVar, "<this>");
        l0.p(random, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(cVar.e(), cVar.g() + 1));
    }

    @u3.h(name = "byteRangeContains")
    public static final boolean l(@p4.l g<Byte> gVar, int i5) {
        l0.p(gVar, "<this>");
        Byte F1 = F1(i5);
        if (F1 != null) {
            return gVar.contains(F1);
        }
        return false;
    }

    @p4.l
    public static final j l0(int i5, short s5) {
        return j.f19544d.a(i5, s5, -1);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final Integer l1(l lVar) {
        l0.p(lVar, "<this>");
        return m1(lVar, kotlin.random.f.Default);
    }

    @u3.h(name = "byteRangeContains")
    public static final boolean m(@p4.l g<Byte> gVar, long j5) {
        l0.p(gVar, "<this>");
        Byte G1 = G1(j5);
        if (G1 != null) {
            return gVar.contains(G1);
        }
        return false;
    }

    @p4.l
    public static final j m0(short s5, byte b5) {
        return j.f19544d.a(s5, b5, -1);
    }

    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    @p4.m
    public static final Integer m1(@p4.l l lVar, @p4.l kotlin.random.f random) {
        l0.p(lVar, "<this>");
        l0.p(random, "random");
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kotlin.random.g.h(random, lVar));
    }

    @u3.h(name = "byteRangeContains")
    public static final boolean n(@p4.l g<Byte> gVar, short s5) {
        l0.p(gVar, "<this>");
        Byte H1 = H1(s5);
        if (H1 != null) {
            return gVar.contains(H1);
        }
        return false;
    }

    @p4.l
    public static final j n0(short s5, int i5) {
        return j.f19544d.a(s5, i5, -1);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final Long n1(o oVar) {
        l0.p(oVar, "<this>");
        return o1(oVar, kotlin.random.f.Default);
    }

    @u3.h(name = "byteRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean o(@p4.l r<Byte> rVar, int i5) {
        l0.p(rVar, "<this>");
        Byte F1 = F1(i5);
        if (F1 != null) {
            return rVar.contains(F1);
        }
        return false;
    }

    @p4.l
    public static final j o0(short s5, short s6) {
        return j.f19544d.a(s5, s6, -1);
    }

    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    @p4.m
    public static final Long o1(@p4.l o oVar, @p4.l kotlin.random.f random) {
        l0.p(oVar, "<this>");
        l0.p(random, "random");
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(kotlin.random.g.i(random, oVar));
    }

    @u3.h(name = "byteRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean p(@p4.l r<Byte> rVar, long j5) {
        l0.p(rVar, "<this>");
        Byte G1 = G1(j5);
        if (G1 != null) {
            return rVar.contains(G1);
        }
        return false;
    }

    @p4.l
    public static final m p0(byte b5, long j5) {
        return m.f19554d.a(b5, j5, -1L);
    }

    @p4.l
    public static final a p1(@p4.l a aVar) {
        l0.p(aVar, "<this>");
        return a.f19524d.a(aVar.g(), aVar.e(), -aVar.i());
    }

    @u3.h(name = "byteRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean q(@p4.l r<Byte> rVar, short s5) {
        l0.p(rVar, "<this>");
        Byte H1 = H1(s5);
        if (H1 != null) {
            return rVar.contains(H1);
        }
        return false;
    }

    @p4.l
    public static final m q0(int i5, long j5) {
        return m.f19554d.a(i5, j5, -1L);
    }

    @p4.l
    public static j q1(@p4.l j jVar) {
        l0.p(jVar, "<this>");
        return j.f19544d.a(jVar.g(), jVar.e(), -jVar.i());
    }

    public static final byte r(byte b5, byte b6) {
        return b5 < b6 ? b6 : b5;
    }

    @p4.l
    public static final m r0(long j5, byte b5) {
        return m.f19554d.a(j5, b5, -1L);
    }

    @p4.l
    public static final m r1(@p4.l m mVar) {
        l0.p(mVar, "<this>");
        return m.f19554d.a(mVar.g(), mVar.e(), -mVar.i());
    }

    public static final double s(double d5, double d6) {
        return d5 < d6 ? d6 : d5;
    }

    @p4.l
    public static final m s0(long j5, int i5) {
        return m.f19554d.a(j5, i5, -1L);
    }

    @u3.h(name = "shortRangeContains")
    public static final boolean s1(@p4.l g<Short> gVar, byte b5) {
        l0.p(gVar, "<this>");
        return gVar.contains(Short.valueOf(b5));
    }

    public static float t(float f5, float f6) {
        return f5 < f6 ? f6 : f5;
    }

    @p4.l
    public static final m t0(long j5, long j6) {
        return m.f19554d.a(j5, j6, -1L);
    }

    @u3.h(name = "shortRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean t1(g gVar, double d5) {
        l0.p(gVar, "<this>");
        Short N1 = N1(d5);
        if (N1 != null) {
            return gVar.contains(N1);
        }
        return false;
    }

    public static int u(int i5, int i6) {
        return i5 < i6 ? i6 : i5;
    }

    @p4.l
    public static final m u0(long j5, short s5) {
        return m.f19554d.a(j5, s5, -1L);
    }

    @u3.h(name = "shortRangeContains")
    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean u1(g gVar, float f5) {
        l0.p(gVar, "<this>");
        Short O1 = O1(f5);
        if (O1 != null) {
            return gVar.contains(O1);
        }
        return false;
    }

    public static long v(long j5, long j6) {
        return j5 < j6 ? j6 : j5;
    }

    @p4.l
    public static final m v0(short s5, long j5) {
        return m.f19554d.a(s5, j5, -1L);
    }

    @u3.h(name = "shortRangeContains")
    public static final boolean v1(@p4.l g<Short> gVar, int i5) {
        l0.p(gVar, "<this>");
        Short P1 = P1(i5);
        if (P1 != null) {
            return gVar.contains(P1);
        }
        return false;
    }

    @p4.l
    public static final <T extends Comparable<? super T>> T w(@p4.l T t5, @p4.l T minimumValue) {
        l0.p(t5, "<this>");
        l0.p(minimumValue, "minimumValue");
        if (t5.compareTo(minimumValue) < 0) {
            return minimumValue;
        }
        return t5;
    }

    @g1(version = "1.7")
    public static final char w0(@p4.l a aVar) {
        l0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.e();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @u3.h(name = "shortRangeContains")
    public static final boolean w1(@p4.l g<Short> gVar, long j5) {
        l0.p(gVar, "<this>");
        Short Q1 = Q1(j5);
        if (Q1 != null) {
            return gVar.contains(Q1);
        }
        return false;
    }

    public static final short x(short s5, short s6) {
        return s5 < s6 ? s6 : s5;
    }

    @g1(version = "1.7")
    public static final int x0(@p4.l j jVar) {
        l0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.e();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @u3.h(name = "shortRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean x1(@p4.l r<Short> rVar, byte b5) {
        l0.p(rVar, "<this>");
        return rVar.contains(Short.valueOf(b5));
    }

    public static final byte y(byte b5, byte b6) {
        return b5 > b6 ? b6 : b5;
    }

    @g1(version = "1.7")
    public static final long y0(@p4.l m mVar) {
        l0.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.e();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @u3.h(name = "shortRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean y1(@p4.l r<Short> rVar, int i5) {
        l0.p(rVar, "<this>");
        Short P1 = P1(i5);
        if (P1 != null) {
            return rVar.contains(P1);
        }
        return false;
    }

    public static final double z(double d5, double d6) {
        return d5 > d6 ? d6 : d5;
    }

    @g1(version = "1.7")
    @p4.m
    public static final Character z0(@p4.l a aVar) {
        l0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.e());
    }

    @u3.h(name = "shortRangeContains")
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final boolean z1(@p4.l r<Short> rVar, long j5) {
        l0.p(rVar, "<this>");
        Short Q1 = Q1(j5);
        if (Q1 != null) {
            return rVar.contains(Q1);
        }
        return false;
    }
}
