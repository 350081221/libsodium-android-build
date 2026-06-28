.class public final Landroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1$iterator$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map$Entry;
.implements Lw3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1$iterator$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Map$Entry<",
        "TKey;TValue;>;",
        "Lw3/a;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\r\n\u0000\n\u0002\u0010&\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R\u0016\u0010\u0002\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\u0008\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00028\u0001X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\u0008"
    }
    d2 = {
        "androidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1$iterator$1$1",
        "",
        "key",
        "getKey",
        "()Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "value",
        "getValue",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final key:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TKey;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TValue;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/collection/IdentityArrayMap;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/collection/IdentityArrayMap<",
            "TKey;TValue;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getKeys()[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    aget-object v0, v0, p2

    .line 9
    .line 10
    const-string v1, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1$iterator$1$1;->key:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    aget-object p1, p1, p2

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1$iterator$1$1;->value:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
.end method


# virtual methods
.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TKey;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1$iterator$1$1;->key:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TValue;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1$iterator$1$1;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TValue;)TValue;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
