.class public final Landroidx/core/view/MenuKt$iterator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lw3/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/MenuKt;->iterator(Landroid/view/Menu;)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Landroid/view/MenuItem;",
        ">;",
        "Lw3/d;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "androidx/core/view/MenuKt$iterator$1",
        "",
        "Landroid/view/MenuItem;",
        "",
        "hasNext",
        "next",
        "Lkotlin/r2;",
        "remove",
        "",
        "index",
        "I",
        "core-ktx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_iterator:Landroid/view/Menu;

.field private index:I


# direct methods
.method constructor <init>(Landroid/view/Menu;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/core/view/MenuKt$iterator$1;->$this_iterator:Landroid/view/Menu;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, Landroidx/core/view/MenuKt$iterator$1;->index:I

    iget-object v1, p0, Landroidx/core/view/MenuKt$iterator$1;->$this_iterator:Landroid/view/Menu;

    invoke-interface {v1}, Landroid/view/Menu;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Landroid/view/MenuItem;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/core/view/MenuKt$iterator$1;->$this_iterator:Landroid/view/Menu;

    iget v1, p0, Landroidx/core/view/MenuKt$iterator$1;->index:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/core/view/MenuKt$iterator$1;->index:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/core/view/MenuKt$iterator$1;->next()Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/core/view/MenuKt$iterator$1;->$this_iterator:Landroid/view/Menu;

    .line 2
    .line 3
    iget v1, p0, Landroidx/core/view/MenuKt$iterator$1;->index:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    iput v1, p0, Landroidx/core/view/MenuKt$iterator$1;->index:I

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-interface {v0, v1}, Landroid/view/Menu;->removeItem(I)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 32
    .line 33
    .line 34
    throw v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
