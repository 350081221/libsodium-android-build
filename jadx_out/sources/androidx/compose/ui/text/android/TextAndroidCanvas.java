package androidx.compose.ui.text.android;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.apache.http.cookie.ClientCookie;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0017J\b\u0010\r\u001a\u00020\u0003H\u0017J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J$\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001c\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J:\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J2\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000fH\u0016J8\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J0\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001dH\u0016J\u0018\u00100\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0012\u00103\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0012\u00104\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000201H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0016J0\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u00109\u001a\u000208H\u0017J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0017J\u0018\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J\n\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010C\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0018\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J0\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020DH\u0017J(\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0010\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020GH\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0018H\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0005H\u0016J0\u0010O\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JH\u0010O\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010T\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000fH\u0016J*\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010V\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010V\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JR\u0010U\u001a\u00020\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017JR\u0010U\u001a\u00020\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u00102\u001a\u0002012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JL\u0010f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u000f2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010e\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J(\u0010j\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u001d2\u0006\u0010h\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000fH\u0016J\u0010\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020mH\u0017J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020nH\u0016J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020pH\u0017J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020m2\u0006\u0010o\u001a\u00020pH\u0017J0\u0010u\u001a\u00020\u00032\u0006\u0010q\u001a\u00020\u001d2\u0006\u0010r\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010x\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010x\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010y\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J0\u0010y\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010z\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\"\u0010}\u001a\u00020\u00032\u0006\u0010|\u001a\u00020{2\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010}\u001a\u00020\u00032\u0006\u0010|\u001a\u00020{2\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\u0018\u0010~\u001a\u00020\u00032\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010\u007f\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u0080\u0001\u001a\u00020\u00032\b\u0010v\u001a\u0004\u0018\u00010b2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0080\u0001\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010\u0085\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0007\u0010\u0084\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J$\u0010\u0085\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0084\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\u0019\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J1\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J!\u0010\u0088\u0001\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000fH\u0016J+\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JC\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JG\u0010\u0092\u0001\u001a\u00020\u00032\u0007\u0010\u008c\u0001\u001a\u00020\u00182\u0007\u0010\u008d\u0001\u001a\u00020\u001d2\u0007\u0010\u008e\u0001\u001a\u00020\u001d2\u0007\u0010\u008f\u0001\u001a\u00020\u00182\u0007\u0010\u0090\u0001\u001a\u00020\u001d2\u0007\u0010\u0091\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J5\u0010\u0092\u0001\u001a\u00020\u00032\u0007\u0010\u008c\u0001\u001a\u00020\u00182\u0007\u0010\u0093\u0001\u001a\u00020b2\u0007\u0010\u008f\u0001\u001a\u00020\u00182\u0007\u0010\u0094\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JH\u0010\u009c\u0001\u001a\u00020\u00032\u0007\u0010\u0095\u0001\u001a\u00020W2\u0007\u0010\u0096\u0001\u001a\u00020\u000f2\u0007\u0010\u0097\u0001\u001a\u00020b2\u0007\u0010\u0098\u0001\u001a\u00020\u000f2\u0007\u0010\u0099\u0001\u001a\u00020\u000f2\b\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J<\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030 \u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JF\u0010£\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0007\u0010¢\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010£\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010=\u001a\u00020<2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0007\u0010¢\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JW\u0010§\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0007\u0010¤\u0001\u001a\u00020\u000f2\u0007\u0010¥\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010§\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030 \u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010§\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030ª\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017Jw\u0010³\u0001\u001a\u00020\u00032\u0007\u0010o\u001a\u00030«\u00012\u0007\u0010¬\u0001\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u000f2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010b2\u0007\u0010®\u0001\u001a\u00020\u000f2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010e\u001a\u00020\u000f2\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00012\u0007\u0010±\u0001\u001a\u00020\u000f2\u0007\u0010²\u0001\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0013\u0010¶\u0001\u001a\u00020\u00032\b\u0010µ\u0001\u001a\u00030´\u0001H\u0017R\u0019\u0010·\u0001\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001¨\u0006»\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/r2;", "setCanvas", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "enableZ", "disableZ", "isOpaque", "", "getWidth", "getHeight", "getDensity", "density", "setDensity", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "", "left", "top", "right", "bottom", "alpha", "saveLayerAlpha", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "sx", "sy", "scale", "degrees", "rotate", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "clipOutRect", "Landroid/graphics/Path;", ClientCookie.PATH_ATTR, "clipPath", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "filter", "setDrawFilter", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "Landroid/graphics/Picture;", "picture", "drawPicture", "dst", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", bi.ay, "r", socket.g.f22386a, "b", "drawARGB", "drawBitmap", "src", "", "colors", TypedValues.CycleType.S_WAVE_OFFSET, "stride", "x", "y", "width", "height", "hasAlpha", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "cx", "cy", "radius", "drawCircle", TypedValues.Custom.S_COLOR, "drawColor", "", "Landroid/graphics/PorterDuff$Mode;", "mode", "Landroid/graphics/BlendMode;", "startX", "startY", "stopX", "stopY", "drawLine", "pts", "count", "drawLines", "drawOval", "drawPaint", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "drawPath", "drawPoint", "drawPoints", "", "text", "index", "pos", "drawPosText", "", "drawRect", "drawRGB", "rx", "ry", "drawRoundRect", "outer", "outerRx", "outerRy", bi.ax, "innerRx", "innerRy", "drawDoubleRoundRect", "outerRadii", "innerRadii", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "drawText", "start", "end", "", "hOffset", "vOffset", "drawTextOnPath", "contextIndex", "contextCount", "isRtl", "drawTextRun", "contextStart", "contextEnd", "Landroid/graphics/text/MeasuredText;", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "nativeCanvas", "Landroid/graphics/Canvas;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    private Canvas nativeCanvas;

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutPath(@p4.l Path path) {
        boolean clipOutPath;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutPath = canvas.clipOutPath(path);
        return clipOutPath;
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@p4.l RectF rectF) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(rectF);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipPath(@p4.l Path path, @p4.l Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipRect(@p4.l RectF rectF, @p4.l Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public void concat(@p4.m Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void disableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i5, int i6, int i7, int i8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i5, i6, i7, i8);
    }

    @Override // android.graphics.Canvas
    public void drawArc(@p4.l RectF rectF, float f5, float f6, boolean z4, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f5, f6, z4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@p4.l Bitmap bitmap, float f5, float f6, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@p4.l Bitmap bitmap, int i5, int i6, @p4.l float[] fArr, int i7, @p4.m int[] iArr, int i8, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i5, i6, fArr, i7, iArr, i8, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f5, float f6, float f7, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f5, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i5);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@p4.l RectF rectF, float f5, float f6, @p4.l RectF rectF2, float f7, float f8, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, f5, f6, rectF2, f7, f8, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawGlyphs(@p4.l int[] iArr, int i5, @p4.l float[] fArr, int i6, int i7, @p4.l Font font, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawGlyphs(iArr, i5, fArr, i6, i7, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f5, float f6, float f7, float f8, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f5, f6, f7, f8, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@p4.l float[] fArr, int i5, int i6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(@p4.l RectF rectF, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(@p4.l NinePatch ninePatch, @p4.l Rect rect, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(@p4.l Path path, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@p4.l Picture picture) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f5, float f6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@p4.m float[] fArr, int i5, int i6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawPosText(@p4.l char[] cArr, int i5, int i6, @p4.l float[] fArr, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i5, i6, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i5, int i6, int i7) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i5, i6, i7);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@p4.l RectF rectF, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawRenderNode(@p4.l RenderNode renderNode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@p4.l RectF rectF, float f5, float f6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@p4.l char[] cArr, int i5, int i6, float f5, float f6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i5, i6, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@p4.l char[] cArr, int i5, int i6, @p4.l Path path, float f5, float f6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i5, i6, path, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@p4.l char[] cArr, int i5, int i6, int i7, int i8, float f5, float f6, boolean z4, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(cArr, i5, i6, i7, i8, f5, f6, z4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@p4.l Canvas.VertexMode vertexMode, int i5, @p4.l float[] fArr, int i6, @p4.m float[] fArr2, int i7, @p4.m int[] iArr, int i8, @p4.m short[] sArr, int i9, int i10, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i5, fArr, i6, fArr2, i7, iArr, i8, sArr, i9, i10, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void enableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@p4.l Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    @p4.m
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void getMatrix(@p4.l Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean quickReject(@p4.l RectF rectF, @p4.l Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i5);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f5);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayer(@p4.m RectF rectF, @p4.m Paint paint, int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i5);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayerAlpha(@p4.m RectF rectF, int i5, int i6) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i5, i6);
    }

    @Override // android.graphics.Canvas
    public void scale(float f5, float f6) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f5, f6);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(@p4.m Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public final void setCanvas(@p4.l Canvas canvas) {
        this.nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i5);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(@p4.m DrawFilter drawFilter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(@p4.m Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f5, float f6) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f5, f6);
    }

    @Override // android.graphics.Canvas
    public void translate(float f5, float f6) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f5, f6);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@p4.l Rect rect) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@p4.l Path path) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipRect(@p4.l Rect rect, @p4.l Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f5, float f6, float f7, float f8, float f9, float f10, boolean z4, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f5, f6, f7, f8, f9, f10, z4, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@p4.l Bitmap bitmap, @p4.m Rect rect, @p4.l RectF rectF, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long j5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j5);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@p4.l RectF rectF, @p4.l float[] fArr, @p4.l RectF rectF2, @p4.l float[] fArr2, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@p4.l float[] fArr, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f5, float f6, float f7, float f8, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f5, f6, f7, f8, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(@p4.l NinePatch ninePatch, @p4.l RectF rectF, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@p4.l Picture picture, @p4.l RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@p4.l float[] fArr, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawPosText(@p4.l String str, @p4.l float[] fArr, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@p4.l Rect rect, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f5, float f6, float f7, float f8, float f9, float f10, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f5, f6, f7, f8, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@p4.l String str, float f5, float f6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@p4.l String str, @p4.l Path path, float f5, float f6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@p4.l CharSequence charSequence, int i5, int i6, int i7, int i8, float f5, float f6, boolean z4, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(charSequence, i5, i6, i7, i8, f5, f6, z4, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@p4.l RectF rectF) {
        boolean quickReject;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(rectF);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@p4.m RectF rectF, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@p4.m RectF rectF, int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i5);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(float f5, float f6, float f7, float f8) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(f5, f6, f7, f8);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@p4.l RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@p4.l Bitmap bitmap, @p4.m Rect rect, @p4.l Rect rect2, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i5, @p4.l PorterDuff.Mode mode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i5, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@p4.l Picture picture, @p4.l Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f5, float f6, float f7, float f8, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f5, f6, f7, f8, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@p4.l String str, int i5, int i6, float f5, float f6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i5, i6, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawTextRun(@p4.l MeasuredText measuredText, int i5, int i6, int i7, int i8, float f5, float f6, boolean z4, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(measuredText, i5, i6, i7, i8, f5, f6, z4, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean quickReject(@p4.l Path path, @p4.l Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayer(float f5, float f6, float f7, float f8, @p4.m Paint paint, int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f5, f6, f7, f8, paint, i5);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayerAlpha(float f5, float f6, float f7, float f8, int i5, int i6) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f5, f6, f7, f8, i5, i6);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(int i5, int i6, int i7, int i8) {
        boolean clipOutRect;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        clipOutRect = canvas.clipOutRect(i5, i6, i7, i8);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@p4.l Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawBitmap(@p4.l int[] iArr, int i5, int i6, float f5, float f6, int i7, int i8, boolean z4, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i5, i6, f5, f6, i7, i8, z4, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(int i5, @p4.l BlendMode blendMode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i5, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawText(@p4.l CharSequence charSequence, int i5, int i6, float f5, float f6, @p4.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i5, i6, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@p4.l Path path) {
        boolean quickReject;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f5, float f6, float f7, float f8, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f5, f6, f7, f8, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f5, float f6, float f7, float f8, int i5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f5, f6, f7, f8, i5);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipRect(float f5, float f6, float f7, float f8, @p4.l Region.Op op) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f5, f6, f7, f8, op);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawBitmap(@p4.l int[] iArr, int i5, int i6, int i7, int i8, int i9, int i10, boolean z4, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i5, i6, i7, i8, i9, i10, z4, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long j5, @p4.l BlendMode blendMode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j5, blendMode);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean quickReject(float f5, float f6, float f7, float f8, @p4.l Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f5, f6, f7, f8, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f5, float f6, float f7, float f8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f5, f6, f7, f8);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@p4.l Bitmap bitmap, @p4.l Matrix matrix, @p4.m Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(float f5, float f6, float f7, float f8) {
        boolean quickReject;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        quickReject = canvas.quickReject(f5, f6, f7, f8);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i5, int i6, int i7, int i8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            l0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i5, i6, i7, i8);
    }
}
