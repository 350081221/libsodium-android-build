.class final Lkotlin/sequences/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/sequences/m;
.implements Lkotlin/sequences/e;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010(\n\u0002\u0008\u0002\u0008\u00c2\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0096\u0002J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lkotlin/sequences/EmptySequence;",
        "Lkotlin/sequences/Sequence;",
        "",
        "Lkotlin/sequences/DropTakeSequence;",
        "()V",
        "drop",
        "n",
        "",
        "iterator",
        "",
        "take",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lkotlin/sequences/g;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/sequences/g;

    invoke-direct {v0}, Lkotlin/sequences/g;-><init>()V

    sput-object v0, Lkotlin/sequences/g;->a:Lkotlin/sequences/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(I)Lkotlin/sequences/m;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/sequences/g;->c(I)Lkotlin/sequences/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(I)Lkotlin/sequences/m;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/sequences/g;->d(I)Lkotlin/sequences/g;

    move-result-object p1

    return-object p1
.end method

.method public c(I)Lkotlin/sequences/g;
    .locals 0
    .annotation build Lp4/l;
    .end annotation

    sget-object p1, Lkotlin/sequences/g;->a:Lkotlin/sequences/g;

    return-object p1
.end method

.method public d(I)Lkotlin/sequences/g;
    .locals 0
    .annotation build Lp4/l;
    .end annotation

    sget-object p1, Lkotlin/sequences/g;->a:Lkotlin/sequences/g;

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lkotlin/collections/g0;->a:Lkotlin/collections/g0;

    return-object v0
.end method
