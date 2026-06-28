.class public final Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;
.super Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/PersistentCompositionLocalMap;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;,
        Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap<",
        "Landroidx/compose/runtime/CompositionLocal<",
        "Ljava/lang/Object;",
        ">;",
        "Landroidx/compose/runtime/State<",
        "+",
        "Ljava/lang/Object;",
        ">;>;",
        "Landroidx/compose/runtime/PersistentCompositionLocalMap;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \u00192\u001e\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u0018\u0019B1\u0012\"\u0010\u0006\u001a\u001e\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u0002H\u0013\"\u0004\u0008\u0000\u0010\u00132\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u0002H\u00130\u0002H\u0096\u0002\u00a2\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016R6\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\r0\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;",
        "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;",
        "Landroidx/compose/runtime/CompositionLocal;",
        "",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/runtime/PersistentCompositionLocalMap;",
        "node",
        "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;",
        "size",
        "",
        "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V",
        "entries",
        "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;",
        "",
        "getEntries",
        "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;",
        "builder",
        "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;",
        "get",
        "T",
        "key",
        "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;",
        "putValue",
        "value",
        "Builder",
        "Companion",
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


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Empty:Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->Companion:Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;

    .line 10
    .line 11
    sget-object v1, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;->Companion:Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;->getEMPTY$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, v1, v2}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;-><init>(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->Empty:Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;

    .line 27
    .line 28
    return-void
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public constructor <init>(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode<",
            "Landroidx/compose/runtime/CompositionLocal<",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Object;",
            ">;>;I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;-><init>(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V

    return-void
.end method

.method public static final synthetic access$getEmpty$cp()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;
    .locals 1

    sget-object v0, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->Empty:Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic builder()Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->builder()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic builder()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->builder()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic builder()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->builder()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;

    move-result-object v0

    return-object v0
.end method

.method public builder()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 4
    new-instance v0, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;

    invoke-direct {v0, p0}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;-><init>(Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;)V

    return-object v0
.end method

.method public bridge containsKey(Landroidx/compose/runtime/CompositionLocal;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/CompositionLocal<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 2
    instance-of v0, p1, Landroidx/compose/runtime/CompositionLocal;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Landroidx/compose/runtime/CompositionLocal;

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->containsKey(Landroidx/compose/runtime/CompositionLocal;)Z

    move-result p1

    return p1
.end method

.method public bridge containsValue(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lkotlin/collections/d;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 2
    instance-of v0, p1, Landroidx/compose/runtime/State;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Landroidx/compose/runtime/State;

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->containsValue(Landroidx/compose/runtime/State;)Z

    move-result p1

    return p1
.end method

.method public bridge get(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/State;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/CompositionLocal<",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/runtime/State;

    return-object p1
.end method

.method public final bridge get(Ljava/lang/Object;)Landroidx/compose/runtime/State;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    instance-of v0, p1, Landroidx/compose/runtime/CompositionLocal;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Landroidx/compose/runtime/CompositionLocal;

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->get(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/State;

    move-result-object p1

    return-object p1
.end method

.method public get(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/runtime/CompositionLocal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/CompositionLocal<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 4
    invoke-static {p0, p1}, Landroidx/compose/runtime/CompositionLocalMapKt;->read(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3
    instance-of v0, p1, Landroidx/compose/runtime/CompositionLocal;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Landroidx/compose/runtime/CompositionLocal;

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->get(Landroidx/compose/runtime/CompositionLocal;)Landroidx/compose/runtime/State;

    move-result-object p1

    return-object p1
.end method

.method public getEntries()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet<",
            "Ljava/util/Map$Entry<",
            "Landroidx/compose/runtime/CompositionLocal<",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-super {p0}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;->getEntries()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;

    move-result-object v0

    return-object v0
.end method

.method public bridge getOrDefault(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/State;)Landroidx/compose/runtime/State;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/CompositionLocal<",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/runtime/State;

    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Landroidx/compose/runtime/State;)Landroidx/compose/runtime/State;
    .locals 1

    .line 2
    instance-of v0, p1, Landroidx/compose/runtime/CompositionLocal;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Landroidx/compose/runtime/CompositionLocal;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->getOrDefault(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/State;)Landroidx/compose/runtime/State;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3
    instance-of v0, p1, Landroidx/compose/runtime/CompositionLocal;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Landroidx/compose/runtime/CompositionLocal;

    check-cast p2, Landroidx/compose/runtime/State;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;->getOrDefault(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/State;)Landroidx/compose/runtime/State;

    move-result-object p1

    return-object p1
.end method

.method public putValue(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/State;)Landroidx/compose/runtime/PersistentCompositionLocalMap;
    .locals 3
    .param p1    # Landroidx/compose/runtime/CompositionLocal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/State;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/CompositionLocal<",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/compose/runtime/PersistentCompositionLocalMap;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;->getNode$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, p1, p2, v2}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;->put(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance p2, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;->getNode()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lkotlin/collections/d;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;->getSizeDelta()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    add-int/2addr v1, p1

    .line 32
    invoke-direct {p2, v0, v1}, Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;-><init>(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V

    .line 33
    .line 34
    .line 35
    return-object p2
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
