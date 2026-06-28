.class public final Lkotlinx/coroutines/channels/j$o;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/j;->o1(Lkotlinx/coroutines/channels/j;Ljava/lang/Object;Ljava/lang/Object;Lv3/a;Lv3/p;Lv3/a;Lv3/r;ILjava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0003\u0010\u000c\u001a\u00020\t\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "R",
        "E",
        "Lkotlinx/coroutines/channels/r;",
        "<anonymous parameter 0>",
        "",
        "<anonymous parameter 1>",
        "<anonymous parameter 2>",
        "",
        "<anonymous parameter 3>",
        "",
        "invoke",
        "(Lkotlinx/coroutines/channels/r;ILjava/lang/Object;J)Ljava/lang/Void;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,3055:1\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/channels/j$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/channels/j$o;

    invoke-direct {v0}, Lkotlinx/coroutines/channels/j$o;-><init>()V

    sput-object v0, Lkotlinx/coroutines/channels/j$o;->INSTANCE:Lkotlinx/coroutines/channels/j$o;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v1, p1

    check-cast v1, Lkotlinx/coroutines/channels/r;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    move-object v0, p0

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lkotlinx/coroutines/channels/j$o;->invoke(Lkotlinx/coroutines/channels/r;ILjava/lang/Object;J)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/channels/r;ILjava/lang/Object;J)Ljava/lang/Void;
    .locals 0
    .param p1    # Lkotlinx/coroutines/channels/r;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/r<",
            "TE;>;ITE;J)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    .line 2
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
