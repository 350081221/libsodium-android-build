.class public final Landroidx/compose/ui/text/android/TextAndroidCanvas;
.super Landroid/graphics/Canvas;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ClassVerificationFailure"
    }
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0015\n\u0002\u0008\n\n\u0002\u0010\u0014\n\u0002\u0008\n\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0019\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\r\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0017\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\t\u00a2\u0006\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0008\u0010\u000c\u001a\u00020\u0003H\u0017J\u0008\u0010\r\u001a\u00020\u0003H\u0017J\u0008\u0010\u000e\u001a\u00020\u0007H\u0016J\u0008\u0010\u0010\u001a\u00020\u000fH\u0016J\u0008\u0010\u0011\u001a\u00020\u000fH\u0016J\u0008\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0008\u0010\u0015\u001a\u00020\u000fH\u0016J\u0008\u0010\u0016\u001a\u00020\u000fH\u0016J\u0008\u0010\u0017\u001a\u00020\u000fH\u0016J$\u0010\u001c\u001a\u00020\u000f2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001c\u0010\u001c\u001a\u00020\u000f2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J:\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J2\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010#\u001a\u00020\u000f2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001a\u0010#\u001a\u00020\u000f2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000fH\u0016J8\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J0\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\u0008\u0010$\u001a\u00020\u0003H\u0016J\u0008\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010\'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001dH\u0016J\u0018\u00100\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0012\u00103\u001a\u00020\u00032\u0008\u00102\u001a\u0004\u0018\u000101H\u0016J\u0012\u00104\u001a\u00020\u00032\u0008\u00102\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000201H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0016J0\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u00109\u001a\u000208H\u0017J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0017J\u0018\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J\n\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010C\u001a\u00020\u00032\u0008\u0010B\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0018\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J0\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020DH\u0017J(\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0010\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020GH\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0018H\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0005H\u0016J0\u0010O\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JH\u0010O\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010T\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000fH\u0016J*\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0008\u0010V\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00182\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0008\u0010V\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00052\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JR\u0010U\u001a\u00020\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u00072\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017JR\u0010U\u001a\u00020\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u00072\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u00102\u001a\u0002012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JL\u0010f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u000f2\u0008\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010e\u001a\u00020\u000f2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J(\u0010j\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u001d2\u0006\u0010h\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000fH\u0016J\u0010\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020mH\u0017J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020nH\u0016J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020pH\u0017J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020m2\u0006\u0010o\u001a\u00020pH\u0017J0\u0010u\u001a\u00020\u00032\u0006\u0010q\u001a\u00020\u001d2\u0006\u0010r\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010x\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010x\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010y\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J0\u0010y\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010z\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\"\u0010}\u001a\u00020\u00032\u0006\u0010|\u001a\u00020{2\u0006\u0010J\u001a\u00020\u00052\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010}\u001a\u00020\u00032\u0006\u0010|\u001a\u00020{2\u0006\u0010J\u001a\u00020\u00182\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\u0018\u0010~\u001a\u00020\u00032\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010\u007f\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u0080\u0001\u001a\u00020\u00032\u0008\u0010v\u001a\u0004\u0018\u00010b2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0080\u0001\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010\u0085\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0007\u0010\u0084\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J$\u0010\u0085\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0084\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\u0019\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J1\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J!\u0010\u0088\u0001\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000fH\u0016J+\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JC\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JG\u0010\u0092\u0001\u001a\u00020\u00032\u0007\u0010\u008c\u0001\u001a\u00020\u00182\u0007\u0010\u008d\u0001\u001a\u00020\u001d2\u0007\u0010\u008e\u0001\u001a\u00020\u001d2\u0007\u0010\u008f\u0001\u001a\u00020\u00182\u0007\u0010\u0090\u0001\u001a\u00020\u001d2\u0007\u0010\u0091\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J5\u0010\u0092\u0001\u001a\u00020\u00032\u0007\u0010\u008c\u0001\u001a\u00020\u00182\u0007\u0010\u0093\u0001\u001a\u00020b2\u0007\u0010\u008f\u0001\u001a\u00020\u00182\u0007\u0010\u0094\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JH\u0010\u009c\u0001\u001a\u00020\u00032\u0007\u0010\u0095\u0001\u001a\u00020W2\u0007\u0010\u0096\u0001\u001a\u00020\u000f2\u0007\u0010\u0097\u0001\u001a\u00020b2\u0007\u0010\u0098\u0001\u001a\u00020\u000f2\u0007\u0010\u0099\u0001\u001a\u00020\u000f2\u0008\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J<\u0010\u009d\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u009d\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009d\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009d\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u00a0\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JF\u0010\u00a3\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\u0007\u0010\u00a1\u0001\u001a\u00020\u001d2\u0007\u0010\u00a2\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010\u00a3\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010=\u001a\u00020<2\u0007\u0010\u00a1\u0001\u001a\u00020\u001d2\u0007\u0010\u00a2\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JW\u0010\u00a7\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0007\u0010\u00a4\u0001\u001a\u00020\u000f2\u0007\u0010\u00a5\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010\u00a6\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010\u00a7\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u00a0\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0007\u0010\u00a8\u0001\u001a\u00020\u000f2\u0007\u0010\u00a9\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010\u00a6\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010\u00a7\u0001\u001a\u00020\u00032\u0008\u0010\u0082\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0007\u0010\u00a8\u0001\u001a\u00020\u000f2\u0007\u0010\u00a9\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010\u00a6\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017Jw\u0010\u00b3\u0001\u001a\u00020\u00032\u0007\u0010o\u001a\u00030\u00ab\u00012\u0007\u0010\u00ac\u0001\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u000f2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010b2\u0007\u0010\u00ae\u0001\u001a\u00020\u000f2\u0008\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010e\u001a\u00020\u000f2\n\u0010\u00b0\u0001\u001a\u0005\u0018\u00010\u00af\u00012\u0007\u0010\u00b1\u0001\u001a\u00020\u000f2\u0007\u0010\u00b2\u0001\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0013\u0010\u00b6\u0001\u001a\u00020\u00032\u0008\u0010\u00b5\u0001\u001a\u00030\u00b4\u0001H\u0017R\u0019\u0010\u00b7\u0001\u001a\u00020\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001\u00a8\u0006\u00bb\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/TextAndroidCanvas;",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Lkotlin/r2;",
        "setCanvas",
        "Landroid/graphics/Rect;",
        "bounds",
        "",
        "getClipBounds",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "setBitmap",
        "enableZ",
        "disableZ",
        "isOpaque",
        "",
        "getWidth",
        "getHeight",
        "getDensity",
        "density",
        "setDensity",
        "getMaximumBitmapWidth",
        "getMaximumBitmapHeight",
        "save",
        "Landroid/graphics/RectF;",
        "Landroid/graphics/Paint;",
        "paint",
        "saveFlags",
        "saveLayer",
        "",
        "left",
        "top",
        "right",
        "bottom",
        "alpha",
        "saveLayerAlpha",
        "restore",
        "getSaveCount",
        "saveCount",
        "restoreToCount",
        "dx",
        "dy",
        "translate",
        "sx",
        "sy",
        "scale",
        "degrees",
        "rotate",
        "skew",
        "Landroid/graphics/Matrix;",
        "matrix",
        "concat",
        "setMatrix",
        "ctm",
        "getMatrix",
        "rect",
        "Landroid/graphics/Region$Op;",
        "op",
        "clipRect",
        "clipOutRect",
        "Landroid/graphics/Path;",
        "path",
        "clipPath",
        "clipOutPath",
        "Landroid/graphics/DrawFilter;",
        "getDrawFilter",
        "filter",
        "setDrawFilter",
        "Landroid/graphics/Canvas$EdgeType;",
        "type",
        "quickReject",
        "Landroid/graphics/Picture;",
        "picture",
        "drawPicture",
        "dst",
        "oval",
        "startAngle",
        "sweepAngle",
        "useCenter",
        "drawArc",
        "a",
        "r",
        "g",
        "b",
        "drawARGB",
        "drawBitmap",
        "src",
        "",
        "colors",
        "offset",
        "stride",
        "x",
        "y",
        "width",
        "height",
        "hasAlpha",
        "meshWidth",
        "meshHeight",
        "",
        "verts",
        "vertOffset",
        "colorOffset",
        "drawBitmapMesh",
        "cx",
        "cy",
        "radius",
        "drawCircle",
        "color",
        "drawColor",
        "",
        "Landroid/graphics/PorterDuff$Mode;",
        "mode",
        "Landroid/graphics/BlendMode;",
        "startX",
        "startY",
        "stopX",
        "stopY",
        "drawLine",
        "pts",
        "count",
        "drawLines",
        "drawOval",
        "drawPaint",
        "Landroid/graphics/NinePatch;",
        "patch",
        "drawPatch",
        "drawPath",
        "drawPoint",
        "drawPoints",
        "",
        "text",
        "index",
        "pos",
        "drawPosText",
        "",
        "drawRect",
        "drawRGB",
        "rx",
        "ry",
        "drawRoundRect",
        "outer",
        "outerRx",
        "outerRy",
        "inner",
        "innerRx",
        "innerRy",
        "drawDoubleRoundRect",
        "outerRadii",
        "innerRadii",
        "glyphIds",
        "glyphIdOffset",
        "positions",
        "positionOffset",
        "glyphCount",
        "Landroid/graphics/fonts/Font;",
        "font",
        "drawGlyphs",
        "drawText",
        "start",
        "end",
        "",
        "hOffset",
        "vOffset",
        "drawTextOnPath",
        "contextIndex",
        "contextCount",
        "isRtl",
        "drawTextRun",
        "contextStart",
        "contextEnd",
        "Landroid/graphics/text/MeasuredText;",
        "Landroid/graphics/Canvas$VertexMode;",
        "vertexCount",
        "texs",
        "texOffset",
        "",
        "indices",
        "indexOffset",
        "indexCount",
        "drawVertices",
        "Landroid/graphics/RenderNode;",
        "renderNode",
        "drawRenderNode",
        "nativeCanvas",
        "Landroid/graphics/Canvas;",
        "<init>",
        "()V",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private nativeCanvas:Landroid/graphics/Canvas;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/Canvas;-><init>()V

    return-void
.end method


# virtual methods
.method public clipOutPath(Landroid/graphics/Path;)Z
    .locals 1
    .param p1    # Landroid/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1}, Landroidx/compose/ui/text/android/r;->a(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z

    move-result p1

    return p1
.end method

.method public clipOutRect(FFFF)Z
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1, p2, p3, p4}, Landroidx/compose/ui/text/android/o;->a(Landroid/graphics/Canvas;FFFF)Z

    move-result p1

    return p1
.end method

.method public clipOutRect(IIII)Z
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1, p2, p3, p4}, Landroidx/compose/ui/text/android/p;->a(Landroid/graphics/Canvas;IIII)Z

    move-result p1

    return p1
.end method

.method public clipOutRect(Landroid/graphics/Rect;)Z
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1}, Landroidx/compose/ui/text/android/q;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public clipOutRect(Landroid/graphics/RectF;)Z
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1}, Landroidx/compose/ui/text/android/m;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z

    move-result p1

    return p1
.end method

.method public clipPath(Landroid/graphics/Path;)Z
    .locals 1
    .param p1    # Landroid/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    move-result p1

    return p1
.end method

.method public clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
    .locals 1
    .param p1    # Landroid/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Region$Op;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    move-result p1

    return p1
.end method

.method public clipRect(FFFF)Z
    .locals 1

    .line 6
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    move-result p1

    return p1
.end method

.method public clipRect(FFFFLandroid/graphics/Region$Op;)Z
    .locals 7
    .param p5    # Landroid/graphics/Region$Op;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 5
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    move-result p1

    return p1
.end method

.method public clipRect(IIII)Z
    .locals 1

    .line 7
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    move-result p1

    return p1
.end method

.method public clipRect(Landroid/graphics/Rect;)Z
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public clipRect(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Region$Op;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z

    move-result p1

    return p1
.end method

.method public clipRect(Landroid/graphics/RectF;)Z
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    move-result p1

    return p1
.end method

.method public clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Region$Op;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z

    move-result p1

    return p1
.end method

.method public concat(Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public disableZ()V
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0}, Landroidx/compose/ui/graphics/q0;->a(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public drawARGB(IIII)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    return-void
.end method

.method public drawArc(FFFFFFZLandroid/graphics/Paint;)V
    .locals 11
    .param p8    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object v0, p0

    .line 2
    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v10, p8

    invoke-virtual/range {v2 .. v10}, Landroid/graphics/Canvas;->drawArc(FFFFFFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
    .locals 7
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 6
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawBitmap([IIIFFIIZLandroid/graphics/Paint;)V
    .locals 12
    .param p1    # [I
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p9    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    move-object v0, p0

    .line 4
    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    invoke-virtual/range {v2 .. v11}, Landroid/graphics/Canvas;->drawBitmap([IIIFFIIZLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawBitmap([IIIIIIIZLandroid/graphics/Paint;)V
    .locals 12
    .param p1    # [I
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p9    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    move-object v0, p0

    .line 5
    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    invoke-virtual/range {v2 .. v11}, Landroid/graphics/Canvas;->drawBitmap([IIIIIIIZLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawBitmapMesh(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V
    .locals 11
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # [I
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param

    move-object v0, p0

    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v10, p8

    invoke-virtual/range {v2 .. v10}, Landroid/graphics/Canvas;->drawBitmapMesh(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V

    return-void
.end method

.method public drawCircle(FFFLandroid/graphics/Paint;)V
    .locals 1
    .param p4    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->drawColor(I)V

    return-void
.end method

.method public drawColor(ILandroid/graphics/BlendMode;)V
    .locals 1
    .param p2    # Landroid/graphics/BlendMode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1, p2}, Landroidx/compose/ui/text/android/i;->a(Landroid/graphics/Canvas;ILandroid/graphics/BlendMode;)V

    return-void
.end method

.method public drawColor(ILandroid/graphics/PorterDuff$Mode;)V
    .locals 1
    .param p2    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public drawColor(J)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1, p2}, Landroidx/compose/ui/text/android/g;->a(Landroid/graphics/Canvas;J)V

    return-void
.end method

.method public drawColor(JLandroid/graphics/BlendMode;)V
    .locals 1
    .param p3    # Landroid/graphics/BlendMode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    .line 5
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1, p2, p3}, Landroidx/compose/ui/text/android/h;->a(Landroid/graphics/Canvas;JLandroid/graphics/BlendMode;)V

    return-void
.end method

.method public drawDoubleRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    .locals 10
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    move-object v0, p0

    .line 1
    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    move v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/text/android/j;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawDoubleRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V
    .locals 7
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/text/android/f;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawGlyphs([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V
    .locals 10
    .param p1    # [I
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Landroid/graphics/fonts/Font;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1f
    .end annotation

    move-object v0, p0

    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/text/android/n;->a(Landroid/graphics/Canvas;[II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawLine(FFFFLandroid/graphics/Paint;)V
    .locals 7
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawLines([FIILandroid/graphics/Paint;)V
    .locals 1
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    return-void
.end method

.method public drawLines([FLandroid/graphics/Paint;)V
    .locals 1
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawOval(FFFFLandroid/graphics/Paint;)V
    .locals 7
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawPaint(Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawPatch(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/NinePatch;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1f
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1, p2, p3}, Landroidx/compose/ui/text/android/e;->a(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawPatch(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/NinePatch;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1f
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1, p2, p3}, Landroidx/compose/ui/text/android/l;->a(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawPicture(Landroid/graphics/Picture;)V
    .locals 1
    .param p1    # Landroid/graphics/Picture;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->drawPicture(Landroid/graphics/Picture;)V

    return-void
.end method

.method public drawPicture(Landroid/graphics/Picture;Landroid/graphics/Rect;)V
    .locals 1
    .param p1    # Landroid/graphics/Picture;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawPicture(Landroid/graphics/Picture;Landroid/graphics/Rect;)V

    return-void
.end method

.method public drawPicture(Landroid/graphics/Picture;Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Landroid/graphics/Picture;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawPicture(Landroid/graphics/Picture;Landroid/graphics/RectF;)V

    return-void
.end method

.method public drawPoint(FFLandroid/graphics/Paint;)V
    .locals 1
    .param p3    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawPoints([FIILandroid/graphics/Paint;)V
    .locals 1
    .param p1    # [F
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->drawPoints([FIILandroid/graphics/Paint;)V

    return-void
.end method

.method public drawPoints([FLandroid/graphics/Paint;)V
    .locals 1
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawPoints([FLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawPosText(Ljava/lang/String;[FLandroid/graphics/Paint;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Canvas;->drawPosText(Ljava/lang/String;[FLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawPosText([CII[FLandroid/graphics/Paint;)V
    .locals 7
    .param p1    # [C
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawPosText([CII[FLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawRGB(III)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Canvas;->drawRGB(III)V

    return-void
.end method

.method public drawRect(FFFFLandroid/graphics/Paint;)V
    .locals 7
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawRenderNode(Landroid/graphics/RenderNode;)V
    .locals 1
    .param p1    # Landroid/graphics/RenderNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1}, Landroidx/compose/ui/platform/c0;->a(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public drawRoundRect(FFFFFFLandroid/graphics/Paint;)V
    .locals 10
    .param p7    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object v0, p0

    .line 2
    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V
    .locals 8
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawText([CIIFFLandroid/graphics/Paint;)V
    .locals 8
    .param p1    # [C
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawTextOnPath([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V
    .locals 10
    .param p1    # [C
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object v0, p0

    .line 1
    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    move v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Canvas;->drawTextOnPath([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawTextRun(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V
    .locals 12
    .param p1    # Landroid/graphics/text/MeasuredText;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p9    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    move-object v0, p0

    .line 3
    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    invoke-static/range {v2 .. v11}, Landroidx/compose/ui/text/android/k;->a(Landroid/graphics/Canvas;Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawTextRun(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V
    .locals 12
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p9    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x17
    .end annotation

    move-object v0, p0

    .line 2
    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    invoke-virtual/range {v2 .. v11}, Landroid/graphics/Canvas;->drawTextRun(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawTextRun([CIIIIFFZLandroid/graphics/Paint;)V
    .locals 12
    .param p1    # [C
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p9    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x17
    .end annotation

    move-object v0, p0

    .line 1
    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    invoke-virtual/range {v2 .. v11}, Landroid/graphics/Canvas;->drawTextRun([CIIIIFFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public drawVertices(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V
    .locals 15
    .param p1    # Landroid/graphics/Canvas$VertexMode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # [F
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # [I
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # [S
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Landroid/graphics/Paint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object v0, p0

    iget-object v1, v0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_0

    const-string v1, "nativeCanvas"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    move-object v2, v1

    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    move-object/from16 v14, p12

    invoke-virtual/range {v2 .. v14}, Landroid/graphics/Canvas;->drawVertices(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V

    return-void
.end method

.method public enableZ()V
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0}, Landroidx/compose/ui/graphics/p0;->a(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public getClipBounds(Landroid/graphics/Rect;)Z
    .locals 4
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "nativeCanvas"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const v2, 0x7fffffff

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {p1, v3, v3, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return v0
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public getDensity()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getDensity()I

    move-result v0

    return v0
.end method

.method public getDrawFilter()Landroid/graphics/DrawFilter;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getDrawFilter()Landroid/graphics/DrawFilter;

    move-result-object v0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getHeight()I

    move-result v0

    return v0
.end method

.method public getMatrix(Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public getMaximumBitmapHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMaximumBitmapHeight()I

    move-result v0

    return v0
.end method

.method public getMaximumBitmapWidth()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMaximumBitmapWidth()I

    move-result v0

    return v0
.end method

.method public getSaveCount()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getSaveCount()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    return v0
.end method

.method public isOpaque()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->isOpaque()Z

    move-result v0

    return v0
.end method

.method public quickReject(FFFF)Z
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1e
    .end annotation

    .line 6
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1, p2, p3, p4}, Landroidx/compose/ui/text/android/u;->a(Landroid/graphics/Canvas;FFFF)Z

    move-result p1

    return p1
.end method

.method public quickReject(FFFFLandroid/graphics/Canvas$EdgeType;)Z
    .locals 7
    .param p5    # Landroid/graphics/Canvas$EdgeType;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 5
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->quickReject(FFFFLandroid/graphics/Canvas$EdgeType;)Z

    move-result p1

    return p1
.end method

.method public quickReject(Landroid/graphics/Path;)Z
    .locals 1
    .param p1    # Landroid/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1e
    .end annotation

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1}, Landroidx/compose/ui/text/android/t;->a(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z

    move-result p1

    return p1
.end method

.method public quickReject(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z
    .locals 1
    .param p1    # Landroid/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Canvas$EdgeType;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->quickReject(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z

    move-result p1

    return p1
.end method

.method public quickReject(Landroid/graphics/RectF;)Z
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1e
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0, p1}, Landroidx/compose/ui/text/android/s;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z

    move-result p1

    return p1
.end method

.method public quickReject(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Canvas$EdgeType;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->quickReject(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z

    move-result p1

    return p1
.end method

.method public restore()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public restoreToCount(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public rotate(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->rotate(F)V

    return-void
.end method

.method public save()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    move-result v0

    return v0
.end method

.method public saveLayer(FFFFLandroid/graphics/Paint;)I
    .locals 7
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    move-result p1

    return p1
.end method

.method public saveLayer(FFFFLandroid/graphics/Paint;I)I
    .locals 8
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    move-result p1

    return p1
.end method

.method public saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    move-result p1

    return p1
.end method

.method public saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    move-result p1

    return p1
.end method

.method public saveLayerAlpha(FFFFI)I
    .locals 7

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayerAlpha(FFFFI)I

    move-result p1

    return p1
.end method

.method public saveLayerAlpha(FFFFII)I
    .locals 8
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->saveLayerAlpha(FFFFII)I

    move-result p1

    return p1
.end method

.method public saveLayerAlpha(Landroid/graphics/RectF;I)I
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;I)I

    move-result p1

    return p1
.end method

.method public saveLayerAlpha(Landroid/graphics/RectF;II)I
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I

    move-result p1

    return p1
.end method

.method public scale(FF)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->scale(FF)V

    return-void
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final setCanvas(Landroid/graphics/Canvas;)V
    .locals 0
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    return-void
.end method

.method public setDensity(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->setDensity(I)V

    return-void
.end method

.method public setDrawFilter(Landroid/graphics/DrawFilter;)V
    .locals 1
    .param p1    # Landroid/graphics/DrawFilter;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    return-void
.end method

.method public setMatrix(Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public skew(FF)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->skew(FF)V

    return-void
.end method

.method public translate(FF)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/TextAndroidCanvas;->nativeCanvas:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    const-string v0, "nativeCanvas"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    return-void
.end method
