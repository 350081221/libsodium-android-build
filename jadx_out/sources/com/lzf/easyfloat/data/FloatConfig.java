package com.lzf.easyfloat.data;

import android.view.View;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lzf.easyfloat.interfaces.a;
import com.lzf.easyfloat.interfaces.b;
import com.lzf.easyfloat.interfaces.c;
import com.lzf.easyfloat.interfaces.d;
import com.lzf.easyfloat.interfaces.f;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.u0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0003\b\u008a\u0001\b\u0086\b\u0018\u00002\u00020\u0001B×\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u00103\u001a\u00020\t\u0012\b\b\u0002\u00104\u001a\u00020\t\u0012\b\b\u0002\u00105\u001a\u00020\t\u0012\b\b\u0002\u00106\u001a\u00020\t\u0012\b\b\u0002\u00107\u001a\u00020\t\u0012\b\b\u0002\u00108\u001a\u00020\t\u0012\b\b\u0002\u00109\u001a\u00020\u0010\u0012\b\b\u0002\u0010:\u001a\u00020\u0012\u0012\b\b\u0002\u0010;\u001a\u00020\t\u0012\b\b\u0002\u0010<\u001a\u00020\t\u0012\b\b\u0002\u0010=\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017\u0012\b\b\u0002\u0010@\u001a\u00020\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\u0002\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010C\u001a\u00020\u0002\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010H\u001a\u00020&\u0012\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070(\u0012\b\b\u0002\u0010J\u001a\u00020\t\u0012\b\b\u0002\u0010K\u001a\u00020\t\u0012\b\b\u0002\u0010L\u001a\u00020\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010'\u001a\u00020&HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070(HÆ\u0003J\u0010\u0010,\u001a\u00020\tHÀ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010.\u001a\u00020\tHÀ\u0003¢\u0006\u0004\b-\u0010+J\t\u0010/\u001a\u00020\u0002HÆ\u0003JÞ\u0002\u0010M\u001a\u00020\u00002\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00103\u001a\u00020\t2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\u00102\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010<\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020\u00022\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00172\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00172\b\b\u0002\u0010@\u001a\u00020\u00022\b\b\u0002\u0010A\u001a\u00020\u00022\b\b\u0002\u0010B\u001a\u00020\u00022\b\b\u0002\u0010C\u001a\u00020\u00022\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010H\u001a\u00020&2\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070(2\b\b\u0002\u0010J\u001a\u00020\t2\b\b\u0002\u0010K\u001a\u00020\t2\b\b\u0002\u0010L\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bM\u0010NJ\t\u0010O\u001a\u00020\u0007HÖ\u0001J\t\u0010P\u001a\u00020\u0002HÖ\u0001J\u0013\u0010R\u001a\u00020\t2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u00100\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010S\u001a\u0004\bT\u0010\u0004\"\u0004\bU\u0010VR$\u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u00102\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u00103\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010a\u001a\u0004\bb\u0010+\"\u0004\bc\u0010dR\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010a\u001a\u0004\b4\u0010+\"\u0004\be\u0010dR\"\u00105\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010a\u001a\u0004\b5\u0010+\"\u0004\bf\u0010dR\"\u00106\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010a\u001a\u0004\b6\u0010+\"\u0004\bg\u0010dR\"\u00107\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010a\u001a\u0004\bh\u0010+\"\u0004\bi\u0010dR\"\u00108\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010a\u001a\u0004\bj\u0010+\"\u0004\bk\u0010dR\"\u00109\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010:\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010;\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010a\u001a\u0004\bv\u0010+\"\u0004\bw\u0010dR\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010a\u001a\u0004\bx\u0010+\"\u0004\by\u0010dR\"\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R2\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b>\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R2\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b?\u0010\u007f\u001a\u0006\b\u0084\u0001\u0010\u0081\u0001\"\u0006\b\u0085\u0001\u0010\u0083\u0001R$\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b@\u0010z\u001a\u0005\b\u0086\u0001\u0010|\"\u0005\b\u0087\u0001\u0010~R$\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bA\u0010z\u001a\u0005\b\u0088\u0001\u0010|\"\u0005\b\u0089\u0001\u0010~R$\u0010B\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bB\u0010z\u001a\u0005\b\u008a\u0001\u0010|\"\u0005\b\u008b\u0001\u0010~R$\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bC\u0010z\u001a\u0005\b\u008c\u0001\u0010|\"\u0005\b\u008d\u0001\u0010~R)\u0010D\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bD\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u0010E\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bE\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010F\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bF\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R)\u0010G\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bG\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R'\u0010H\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bH\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R \u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070(8\u0006¢\u0006\u000f\n\u0005\bI\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R$\u0010J\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bJ\u0010a\u001a\u0005\bª\u0001\u0010+\"\u0005\b«\u0001\u0010dR$\u0010K\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bK\u0010a\u001a\u0005\b¬\u0001\u0010+\"\u0005\b\u00ad\u0001\u0010dR$\u0010L\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bL\u0010z\u001a\u0005\b®\u0001\u0010|\"\u0005\b¯\u0001\u0010~¨\u0006²\u0001"}, d2 = {"Lcom/lzf/easyfloat/data/FloatConfig;", "", "", "component1", "()Ljava/lang/Integer;", "Landroid/view/View;", "component2", "", "component3", "", "component4", "component5", "component6", "component7", "component8", "component9", "Lm2/b;", "component10", "Lm2/a;", "component11", "component12", "component13", "component14", "Lkotlin/u0;", "component15", "component16", "component17", "component18", "component19", "component20", "Lcom/lzf/easyfloat/interfaces/f;", "component21", "Lcom/lzf/easyfloat/interfaces/d;", "component22", "Lcom/lzf/easyfloat/interfaces/a;", "component23", "Lcom/lzf/easyfloat/interfaces/c;", "component24", "Lcom/lzf/easyfloat/interfaces/b;", "component25", "", "component26", "component27$easyfloat_release", "()Z", "component27", "component28$easyfloat_release", "component28", "component29", "layoutId", "layoutView", "floatTag", "dragEnable", "isDrag", "isAnim", "isShow", "hasEditText", "immersionStatusBar", "sidePattern", "showPattern", "widthMatch", "heightMatch", "gravity", "offsetPair", "locationPair", "leftBorder", "topBorder", "rightBorder", "bottomBorder", "invokeView", "callbacks", "floatCallbacks", "floatAnimator", "displayHeight", "filterSet", "filterSelf", "needShow", "layoutChangedGravity", "copy", "(Ljava/lang/Integer;Landroid/view/View;Ljava/lang/String;ZZZZZZLm2/b;Lm2/a;ZZILkotlin/u0;Lkotlin/u0;IIIILcom/lzf/easyfloat/interfaces/f;Lcom/lzf/easyfloat/interfaces/d;Lcom/lzf/easyfloat/interfaces/a;Lcom/lzf/easyfloat/interfaces/c;Lcom/lzf/easyfloat/interfaces/b;Ljava/util/Set;ZZI)Lcom/lzf/easyfloat/data/FloatConfig;", "toString", TTDownloadField.TT_HASHCODE, "other", "equals", "Ljava/lang/Integer;", "getLayoutId", "setLayoutId", "(Ljava/lang/Integer;)V", "Landroid/view/View;", "getLayoutView", "()Landroid/view/View;", "setLayoutView", "(Landroid/view/View;)V", "Ljava/lang/String;", "getFloatTag", "()Ljava/lang/String;", "setFloatTag", "(Ljava/lang/String;)V", "Z", "getDragEnable", "setDragEnable", "(Z)V", "setDrag", "setAnim", "setShow", "getHasEditText", "setHasEditText", "getImmersionStatusBar", "setImmersionStatusBar", "Lm2/b;", "getSidePattern", "()Lm2/b;", "setSidePattern", "(Lm2/b;)V", "Lm2/a;", "getShowPattern", "()Lm2/a;", "setShowPattern", "(Lm2/a;)V", "getWidthMatch", "setWidthMatch", "getHeightMatch", "setHeightMatch", "I", "getGravity", "()I", "setGravity", "(I)V", "Lkotlin/u0;", "getOffsetPair", "()Lkotlin/u0;", "setOffsetPair", "(Lkotlin/u0;)V", "getLocationPair", "setLocationPair", "getLeftBorder", "setLeftBorder", "getTopBorder", "setTopBorder", "getRightBorder", "setRightBorder", "getBottomBorder", "setBottomBorder", "Lcom/lzf/easyfloat/interfaces/f;", "getInvokeView", "()Lcom/lzf/easyfloat/interfaces/f;", "setInvokeView", "(Lcom/lzf/easyfloat/interfaces/f;)V", "Lcom/lzf/easyfloat/interfaces/d;", "getCallbacks", "()Lcom/lzf/easyfloat/interfaces/d;", "setCallbacks", "(Lcom/lzf/easyfloat/interfaces/d;)V", "Lcom/lzf/easyfloat/interfaces/a;", "getFloatCallbacks", "()Lcom/lzf/easyfloat/interfaces/a;", "setFloatCallbacks", "(Lcom/lzf/easyfloat/interfaces/a;)V", "Lcom/lzf/easyfloat/interfaces/c;", "getFloatAnimator", "()Lcom/lzf/easyfloat/interfaces/c;", "setFloatAnimator", "(Lcom/lzf/easyfloat/interfaces/c;)V", "Lcom/lzf/easyfloat/interfaces/b;", "getDisplayHeight", "()Lcom/lzf/easyfloat/interfaces/b;", "setDisplayHeight", "(Lcom/lzf/easyfloat/interfaces/b;)V", "Ljava/util/Set;", "getFilterSet", "()Ljava/util/Set;", "getFilterSelf$easyfloat_release", "setFilterSelf$easyfloat_release", "getNeedShow$easyfloat_release", "setNeedShow$easyfloat_release", "getLayoutChangedGravity", "setLayoutChangedGravity", "<init>", "(Ljava/lang/Integer;Landroid/view/View;Ljava/lang/String;ZZZZZZLm2/b;Lm2/a;ZZILkotlin/u0;Lkotlin/u0;IIIILcom/lzf/easyfloat/interfaces/f;Lcom/lzf/easyfloat/interfaces/d;Lcom/lzf/easyfloat/interfaces/a;Lcom/lzf/easyfloat/interfaces/c;Lcom/lzf/easyfloat/interfaces/b;Ljava/util/Set;ZZI)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class FloatConfig {
    private int bottomBorder;

    @m
    private d callbacks;

    @l
    private b displayHeight;
    private boolean dragEnable;
    private boolean filterSelf;

    @l
    private final Set<String> filterSet;

    @m
    private c floatAnimator;

    @m
    private a floatCallbacks;

    @m
    private String floatTag;
    private int gravity;
    private boolean hasEditText;
    private boolean heightMatch;
    private boolean immersionStatusBar;

    @m
    private f invokeView;
    private boolean isAnim;
    private boolean isDrag;
    private boolean isShow;
    private int layoutChangedGravity;

    @m
    private Integer layoutId;

    @m
    private View layoutView;
    private int leftBorder;

    @l
    private u0<Integer, Integer> locationPair;
    private boolean needShow;

    @l
    private u0<Integer, Integer> offsetPair;
    private int rightBorder;

    @l
    private m2.a showPattern;

    @l
    private m2.b sidePattern;
    private int topBorder;
    private boolean widthMatch;

    public FloatConfig() {
        this(null, null, null, false, false, false, false, false, false, null, null, false, false, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 536870911, null);
    }

    public FloatConfig(@m Integer num, @m View view, @m String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, @l m2.b sidePattern, @l m2.a showPattern, boolean z10, boolean z11, int i5, @l u0<Integer, Integer> offsetPair, @l u0<Integer, Integer> locationPair, int i6, int i7, int i8, int i9, @m f fVar, @m d dVar, @m a aVar, @m c cVar, @l b displayHeight, @l Set<String> filterSet, boolean z12, boolean z13, int i10) {
        l0.p(sidePattern, "sidePattern");
        l0.p(showPattern, "showPattern");
        l0.p(offsetPair, "offsetPair");
        l0.p(locationPair, "locationPair");
        l0.p(displayHeight, "displayHeight");
        l0.p(filterSet, "filterSet");
        this.layoutId = num;
        this.layoutView = view;
        this.floatTag = str;
        this.dragEnable = z4;
        this.isDrag = z5;
        this.isAnim = z6;
        this.isShow = z7;
        this.hasEditText = z8;
        this.immersionStatusBar = z9;
        this.sidePattern = sidePattern;
        this.showPattern = showPattern;
        this.widthMatch = z10;
        this.heightMatch = z11;
        this.gravity = i5;
        this.offsetPair = offsetPair;
        this.locationPair = locationPair;
        this.leftBorder = i6;
        this.topBorder = i7;
        this.rightBorder = i8;
        this.bottomBorder = i9;
        this.invokeView = fVar;
        this.callbacks = dVar;
        this.floatCallbacks = aVar;
        this.floatAnimator = cVar;
        this.displayHeight = displayHeight;
        this.filterSet = filterSet;
        this.filterSelf = z12;
        this.needShow = z13;
        this.layoutChangedGravity = i10;
    }

    @m
    public final Integer component1() {
        return this.layoutId;
    }

    @l
    public final m2.b component10() {
        return this.sidePattern;
    }

    @l
    public final m2.a component11() {
        return this.showPattern;
    }

    public final boolean component12() {
        return this.widthMatch;
    }

    public final boolean component13() {
        return this.heightMatch;
    }

    public final int component14() {
        return this.gravity;
    }

    @l
    public final u0<Integer, Integer> component15() {
        return this.offsetPair;
    }

    @l
    public final u0<Integer, Integer> component16() {
        return this.locationPair;
    }

    public final int component17() {
        return this.leftBorder;
    }

    public final int component18() {
        return this.topBorder;
    }

    public final int component19() {
        return this.rightBorder;
    }

    @m
    public final View component2() {
        return this.layoutView;
    }

    public final int component20() {
        return this.bottomBorder;
    }

    @m
    public final f component21() {
        return this.invokeView;
    }

    @m
    public final d component22() {
        return this.callbacks;
    }

    @m
    public final a component23() {
        return this.floatCallbacks;
    }

    @m
    public final c component24() {
        return this.floatAnimator;
    }

    @l
    public final b component25() {
        return this.displayHeight;
    }

    @l
    public final Set<String> component26() {
        return this.filterSet;
    }

    public final boolean component27$easyfloat_release() {
        return this.filterSelf;
    }

    public final boolean component28$easyfloat_release() {
        return this.needShow;
    }

    public final int component29() {
        return this.layoutChangedGravity;
    }

    @m
    public final String component3() {
        return this.floatTag;
    }

    public final boolean component4() {
        return this.dragEnable;
    }

    public final boolean component5() {
        return this.isDrag;
    }

    public final boolean component6() {
        return this.isAnim;
    }

    public final boolean component7() {
        return this.isShow;
    }

    public final boolean component8() {
        return this.hasEditText;
    }

    public final boolean component9() {
        return this.immersionStatusBar;
    }

    @l
    public final FloatConfig copy(@m Integer num, @m View view, @m String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, @l m2.b sidePattern, @l m2.a showPattern, boolean z10, boolean z11, int i5, @l u0<Integer, Integer> offsetPair, @l u0<Integer, Integer> locationPair, int i6, int i7, int i8, int i9, @m f fVar, @m d dVar, @m a aVar, @m c cVar, @l b displayHeight, @l Set<String> filterSet, boolean z12, boolean z13, int i10) {
        l0.p(sidePattern, "sidePattern");
        l0.p(showPattern, "showPattern");
        l0.p(offsetPair, "offsetPair");
        l0.p(locationPair, "locationPair");
        l0.p(displayHeight, "displayHeight");
        l0.p(filterSet, "filterSet");
        return new FloatConfig(num, view, str, z4, z5, z6, z7, z8, z9, sidePattern, showPattern, z10, z11, i5, offsetPair, locationPair, i6, i7, i8, i9, fVar, dVar, aVar, cVar, displayHeight, filterSet, z12, z13, i10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatConfig)) {
            return false;
        }
        FloatConfig floatConfig = (FloatConfig) obj;
        return l0.g(this.layoutId, floatConfig.layoutId) && l0.g(this.layoutView, floatConfig.layoutView) && l0.g(this.floatTag, floatConfig.floatTag) && this.dragEnable == floatConfig.dragEnable && this.isDrag == floatConfig.isDrag && this.isAnim == floatConfig.isAnim && this.isShow == floatConfig.isShow && this.hasEditText == floatConfig.hasEditText && this.immersionStatusBar == floatConfig.immersionStatusBar && this.sidePattern == floatConfig.sidePattern && this.showPattern == floatConfig.showPattern && this.widthMatch == floatConfig.widthMatch && this.heightMatch == floatConfig.heightMatch && this.gravity == floatConfig.gravity && l0.g(this.offsetPair, floatConfig.offsetPair) && l0.g(this.locationPair, floatConfig.locationPair) && this.leftBorder == floatConfig.leftBorder && this.topBorder == floatConfig.topBorder && this.rightBorder == floatConfig.rightBorder && this.bottomBorder == floatConfig.bottomBorder && l0.g(this.invokeView, floatConfig.invokeView) && l0.g(this.callbacks, floatConfig.callbacks) && l0.g(this.floatCallbacks, floatConfig.floatCallbacks) && l0.g(this.floatAnimator, floatConfig.floatAnimator) && l0.g(this.displayHeight, floatConfig.displayHeight) && l0.g(this.filterSet, floatConfig.filterSet) && this.filterSelf == floatConfig.filterSelf && this.needShow == floatConfig.needShow && this.layoutChangedGravity == floatConfig.layoutChangedGravity;
    }

    public final int getBottomBorder() {
        return this.bottomBorder;
    }

    @m
    public final d getCallbacks() {
        return this.callbacks;
    }

    @l
    public final b getDisplayHeight() {
        return this.displayHeight;
    }

    public final boolean getDragEnable() {
        return this.dragEnable;
    }

    public final boolean getFilterSelf$easyfloat_release() {
        return this.filterSelf;
    }

    @l
    public final Set<String> getFilterSet() {
        return this.filterSet;
    }

    @m
    public final c getFloatAnimator() {
        return this.floatAnimator;
    }

    @m
    public final a getFloatCallbacks() {
        return this.floatCallbacks;
    }

    @m
    public final String getFloatTag() {
        return this.floatTag;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final boolean getHasEditText() {
        return this.hasEditText;
    }

    public final boolean getHeightMatch() {
        return this.heightMatch;
    }

    public final boolean getImmersionStatusBar() {
        return this.immersionStatusBar;
    }

    @m
    public final f getInvokeView() {
        return this.invokeView;
    }

    public final int getLayoutChangedGravity() {
        return this.layoutChangedGravity;
    }

    @m
    public final Integer getLayoutId() {
        return this.layoutId;
    }

    @m
    public final View getLayoutView() {
        return this.layoutView;
    }

    public final int getLeftBorder() {
        return this.leftBorder;
    }

    @l
    public final u0<Integer, Integer> getLocationPair() {
        return this.locationPair;
    }

    public final boolean getNeedShow$easyfloat_release() {
        return this.needShow;
    }

    @l
    public final u0<Integer, Integer> getOffsetPair() {
        return this.offsetPair;
    }

    public final int getRightBorder() {
        return this.rightBorder;
    }

    @l
    public final m2.a getShowPattern() {
        return this.showPattern;
    }

    @l
    public final m2.b getSidePattern() {
        return this.sidePattern;
    }

    public final int getTopBorder() {
        return this.topBorder;
    }

    public final boolean getWidthMatch() {
        return this.widthMatch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.layoutId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        View view = this.layoutView;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        String str = this.floatTag;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z4 = this.dragEnable;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode3 + i5) * 31;
        boolean z5 = this.isDrag;
        int i7 = z5;
        if (z5 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z6 = this.isAnim;
        int i9 = z6;
        if (z6 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z7 = this.isShow;
        int i11 = z7;
        if (z7 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z8 = this.hasEditText;
        int i13 = z8;
        if (z8 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z9 = this.immersionStatusBar;
        int i15 = z9;
        if (z9 != 0) {
            i15 = 1;
        }
        int hashCode4 = (((((i14 + i15) * 31) + this.sidePattern.hashCode()) * 31) + this.showPattern.hashCode()) * 31;
        boolean z10 = this.widthMatch;
        int i16 = z10;
        if (z10 != 0) {
            i16 = 1;
        }
        int i17 = (hashCode4 + i16) * 31;
        boolean z11 = this.heightMatch;
        int i18 = z11;
        if (z11 != 0) {
            i18 = 1;
        }
        int hashCode5 = (((((((((((((((i17 + i18) * 31) + Integer.hashCode(this.gravity)) * 31) + this.offsetPair.hashCode()) * 31) + this.locationPair.hashCode()) * 31) + Integer.hashCode(this.leftBorder)) * 31) + Integer.hashCode(this.topBorder)) * 31) + Integer.hashCode(this.rightBorder)) * 31) + Integer.hashCode(this.bottomBorder)) * 31;
        f fVar = this.invokeView;
        int hashCode6 = (hashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        d dVar = this.callbacks;
        int hashCode7 = (hashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.floatCallbacks;
        int hashCode8 = (hashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.floatAnimator;
        int hashCode9 = (((((hashCode8 + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.displayHeight.hashCode()) * 31) + this.filterSet.hashCode()) * 31;
        boolean z12 = this.filterSelf;
        int i19 = z12;
        if (z12 != 0) {
            i19 = 1;
        }
        int i20 = (hashCode9 + i19) * 31;
        boolean z13 = this.needShow;
        return ((i20 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + Integer.hashCode(this.layoutChangedGravity);
    }

    public final boolean isAnim() {
        return this.isAnim;
    }

    public final boolean isDrag() {
        return this.isDrag;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setAnim(boolean z4) {
        this.isAnim = z4;
    }

    public final void setBottomBorder(int i5) {
        this.bottomBorder = i5;
    }

    public final void setCallbacks(@m d dVar) {
        this.callbacks = dVar;
    }

    public final void setDisplayHeight(@l b bVar) {
        l0.p(bVar, "<set-?>");
        this.displayHeight = bVar;
    }

    public final void setDrag(boolean z4) {
        this.isDrag = z4;
    }

    public final void setDragEnable(boolean z4) {
        this.dragEnable = z4;
    }

    public final void setFilterSelf$easyfloat_release(boolean z4) {
        this.filterSelf = z4;
    }

    public final void setFloatAnimator(@m c cVar) {
        this.floatAnimator = cVar;
    }

    public final void setFloatCallbacks(@m a aVar) {
        this.floatCallbacks = aVar;
    }

    public final void setFloatTag(@m String str) {
        this.floatTag = str;
    }

    public final void setGravity(int i5) {
        this.gravity = i5;
    }

    public final void setHasEditText(boolean z4) {
        this.hasEditText = z4;
    }

    public final void setHeightMatch(boolean z4) {
        this.heightMatch = z4;
    }

    public final void setImmersionStatusBar(boolean z4) {
        this.immersionStatusBar = z4;
    }

    public final void setInvokeView(@m f fVar) {
        this.invokeView = fVar;
    }

    public final void setLayoutChangedGravity(int i5) {
        this.layoutChangedGravity = i5;
    }

    public final void setLayoutId(@m Integer num) {
        this.layoutId = num;
    }

    public final void setLayoutView(@m View view) {
        this.layoutView = view;
    }

    public final void setLeftBorder(int i5) {
        this.leftBorder = i5;
    }

    public final void setLocationPair(@l u0<Integer, Integer> u0Var) {
        l0.p(u0Var, "<set-?>");
        this.locationPair = u0Var;
    }

    public final void setNeedShow$easyfloat_release(boolean z4) {
        this.needShow = z4;
    }

    public final void setOffsetPair(@l u0<Integer, Integer> u0Var) {
        l0.p(u0Var, "<set-?>");
        this.offsetPair = u0Var;
    }

    public final void setRightBorder(int i5) {
        this.rightBorder = i5;
    }

    public final void setShow(boolean z4) {
        this.isShow = z4;
    }

    public final void setShowPattern(@l m2.a aVar) {
        l0.p(aVar, "<set-?>");
        this.showPattern = aVar;
    }

    public final void setSidePattern(@l m2.b bVar) {
        l0.p(bVar, "<set-?>");
        this.sidePattern = bVar;
    }

    public final void setTopBorder(int i5) {
        this.topBorder = i5;
    }

    public final void setWidthMatch(boolean z4) {
        this.widthMatch = z4;
    }

    @l
    public String toString() {
        return "FloatConfig(layoutId=" + this.layoutId + ", layoutView=" + this.layoutView + ", floatTag=" + ((Object) this.floatTag) + ", dragEnable=" + this.dragEnable + ", isDrag=" + this.isDrag + ", isAnim=" + this.isAnim + ", isShow=" + this.isShow + ", hasEditText=" + this.hasEditText + ", immersionStatusBar=" + this.immersionStatusBar + ", sidePattern=" + this.sidePattern + ", showPattern=" + this.showPattern + ", widthMatch=" + this.widthMatch + ", heightMatch=" + this.heightMatch + ", gravity=" + this.gravity + ", offsetPair=" + this.offsetPair + ", locationPair=" + this.locationPair + ", leftBorder=" + this.leftBorder + ", topBorder=" + this.topBorder + ", rightBorder=" + this.rightBorder + ", bottomBorder=" + this.bottomBorder + ", invokeView=" + this.invokeView + ", callbacks=" + this.callbacks + ", floatCallbacks=" + this.floatCallbacks + ", floatAnimator=" + this.floatAnimator + ", displayHeight=" + this.displayHeight + ", filterSet=" + this.filterSet + ", filterSelf=" + this.filterSelf + ", needShow=" + this.needShow + ", layoutChangedGravity=" + this.layoutChangedGravity + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FloatConfig(java.lang.Integer r31, android.view.View r32, java.lang.String r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, m2.b r40, m2.a r41, boolean r42, boolean r43, int r44, kotlin.u0 r45, kotlin.u0 r46, int r47, int r48, int r49, int r50, com.lzf.easyfloat.interfaces.f r51, com.lzf.easyfloat.interfaces.d r52, com.lzf.easyfloat.interfaces.a r53, com.lzf.easyfloat.interfaces.c r54, com.lzf.easyfloat.interfaces.b r55, java.util.Set r56, boolean r57, boolean r58, int r59, int r60, kotlin.jvm.internal.w r61) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lzf.easyfloat.data.FloatConfig.<init>(java.lang.Integer, android.view.View, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, m2.b, m2.a, boolean, boolean, int, kotlin.u0, kotlin.u0, int, int, int, int, com.lzf.easyfloat.interfaces.f, com.lzf.easyfloat.interfaces.d, com.lzf.easyfloat.interfaces.a, com.lzf.easyfloat.interfaces.c, com.lzf.easyfloat.interfaces.b, java.util.Set, boolean, boolean, int, int, kotlin.jvm.internal.w):void");
    }
}
