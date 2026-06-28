.class public final Landroidx/compose/runtime/collection/IdentityArrayMap;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u000f\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0004\u0008\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010-\u001a\u00020\u0005\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0008\u001a\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000c\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0086\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0010J\u0006\u0010\u0016\u001a\u00020\u0012JA\u0010\u001b\u001a\u00020\u001226\u0010\u001a\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u0004\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u0011\u0012\u0004\u0012\u00020\n0\u0017H\u0086\u0008J,\u0010\u001d\u001a\u00020\u00122!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u0011\u0012\u0004\u0012\u00020\n0\u001cH\u0086\u0008JA\u0010\u001e\u001a\u00020\u001226\u0010\u001a\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u0004\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u0011\u0012\u0004\u0012\u00020\u00120\u0017H\u0086\u0008J\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fR4\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R4\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\'\u0010$\u001a\u0004\u0008(\u0010&R$\u0010)\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00058\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,\u00a8\u00060"
    }
    d2 = {
        "Landroidx/compose/runtime/collection/IdentityArrayMap;",
        "",
        "Key",
        "Value",
        "key",
        "",
        "find",
        "midIndex",
        "keyHash",
        "findExactIndex",
        "",
        "isEmpty",
        "isNotEmpty",
        "contains",
        "(Ljava/lang/Object;)Z",
        "get",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "value",
        "Lkotlin/r2;",
        "set",
        "(Ljava/lang/Object;Ljava/lang/Object;)V",
        "remove",
        "clear",
        "Lkotlin/Function2;",
        "Lkotlin/v0;",
        "name",
        "block",
        "removeIf",
        "Lkotlin/Function1;",
        "removeValueIf",
        "forEach",
        "",
        "asMap",
        "",
        "<set-?>",
        "keys",
        "[Ljava/lang/Object;",
        "getKeys",
        "()[Ljava/lang/Object;",
        "values",
        "getValues",
        "size",
        "I",
        "getSize",
        "()I",
        "capacity",
        "<init>",
        "(I)V",
        "runtime_release"
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
        "SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,298:1\n125#1,22:299\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n149#1:299,22\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private keys:[Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private size:I

.field private values:[Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/compose/runtime/collection/IdentityArrayMap;-><init>(IILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->keys:[Ljava/lang/Object;

    .line 3
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->values:[Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityArrayMap;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$setSize$p(Landroidx/compose/runtime/collection/IdentityArrayMap;I)V
    .locals 0

    iput p1, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    return-void
.end method

.method private final find(Ljava/lang/Object;)I
    .locals 7

    .line 1
    invoke-static {p1}, Landroidx/compose/runtime/ActualJvm_jvmKt;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->keys:[Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-gt v3, v1, :cond_3

    .line 13
    .line 14
    add-int v4, v3, v1

    .line 15
    .line 16
    ushr-int/lit8 v4, v4, 0x1

    .line 17
    .line 18
    aget-object v5, v2, v4

    .line 19
    .line 20
    invoke-static {v5}, Landroidx/compose/runtime/ActualJvm_jvmKt;->identityHashCode(Ljava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ge v6, v0, :cond_0

    .line 25
    .line 26
    add-int/lit8 v3, v4, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-le v6, v0, :cond_1

    .line 30
    .line 31
    add-int/lit8 v1, v4, -0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    if-ne p1, v5, :cond_2

    .line 35
    .line 36
    return v4

    .line 37
    :cond_2
    invoke-direct {p0, v4, p1, v0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->findExactIndex(ILjava/lang/Object;I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    neg-int p1, v3

    .line 45
    return p1
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
.end method

.method private final findExactIndex(ILjava/lang/Object;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->keys:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    .line 4
    .line 5
    add-int/lit8 v2, p1, -0x1

    .line 6
    .line 7
    :goto_0
    const/4 v3, -0x1

    .line 8
    if-ge v3, v2, :cond_2

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    if-ne v3, p2, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    invoke-static {v3}, Landroidx/compose/runtime/ActualJvm_jvmKt;->identityHashCode(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eq v3, p3, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    if-ge p1, v1, :cond_4

    .line 28
    .line 29
    aget-object v2, v0, p1

    .line 30
    .line 31
    if-ne v2, p2, :cond_3

    .line 32
    .line 33
    return p1

    .line 34
    :cond_3
    invoke-static {v2}, Landroidx/compose/runtime/ActualJvm_jvmKt;->identityHashCode(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eq v2, p3, :cond_2

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    neg-int p1, p1

    .line 43
    return p1

    .line 44
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    neg-int p1, v1

    .line 47
    return p1
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method


# virtual methods
.method public final asMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TKey;TValue;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/runtime/collection/IdentityArrayMap$asMap$1;

    invoke-direct {v0, p0}, Landroidx/compose/runtime/collection/IdentityArrayMap$asMap$1;-><init>(Landroidx/compose/runtime/collection/IdentityArrayMap;)V

    return-object v0
.end method

.method public final clear()V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->keys:[Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x6

    .line 10
    const/4 v6, 0x0

    .line 11
    invoke-static/range {v1 .. v6}, Lkotlin/collections/l;->V1([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v7, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->values:[Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x6

    .line 20
    const/4 v12, 0x0

    .line 21
    invoke-static/range {v7 .. v12}, Lkotlin/collections/l;->V1([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
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

.method public final contains(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKey;)Z"
        }
    .end annotation

    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityArrayMap;->find(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final forEach(Lv3/p;)V
    .locals 4
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-TKey;-TValue;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getKeys()[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    aget-object v2, v2, v1

    .line 13
    .line 14
    const-string v3, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    aget-object v3, v3, v1

    .line 24
    .line 25
    invoke-interface {p1, v2, v3}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
    .line 32
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKey;)TValue;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityArrayMap;->find(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->values:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    return-object p1
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final getKeys()[Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->keys:[Ljava/lang/Object;

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    return v0
.end method

.method public final getValues()[Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->values:[Ljava/lang/Object;

    return-object v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isNotEmpty()Z
    .locals 1

    iget v0, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKey;)TValue;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityArrayMap;->find(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->values:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object v2, v1, p1

    .line 11
    .line 12
    iget v3, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    .line 13
    .line 14
    iget-object v4, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->keys:[Ljava/lang/Object;

    .line 15
    .line 16
    add-int/lit8 v5, p1, 0x1

    .line 17
    .line 18
    invoke-static {v4, v4, p1, v5, v3}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v1, p1, v5, v3}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    add-int/lit8 v3, v3, -0x1

    .line 25
    .line 26
    aput-object v0, v4, v3

    .line 27
    .line 28
    aput-object v0, v1, v3

    .line 29
    .line 30
    iput v3, p0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    .line 31
    .line 32
    return-object v2

    .line 33
    :cond_0
    return-object v0
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
.end method

.method public final removeIf(Lv3/p;)V
    .locals 5
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-TKey;-TValue;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getKeys()[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    aget-object v3, v3, v1

    .line 14
    .line 15
    const-string v4, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"

    .line 16
    .line 17
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    aget-object v4, v4, v1

    .line 25
    .line 26
    invoke-interface {p1, v3, v4}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    if-eq v2, v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getKeys()[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    aput-object v3, v4, v2

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    aget-object v4, v4, v1

    .line 55
    .line 56
    aput-object v4, v3, v2

    .line 57
    .line 58
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getSize()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-le p1, v2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getSize()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    move v0, v2

    .line 74
    :goto_1
    if-ge v0, p1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getKeys()[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/4 v3, 0x0

    .line 81
    aput-object v3, v1, v0

    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    aput-object v3, v1, v0

    .line 88
    .line 89
    add-int/lit8 v0, v0, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-static {p0, v2}, Landroidx/compose/runtime/collection/IdentityArrayMap;->access$setSize$p(Landroidx/compose/runtime/collection/IdentityArrayMap;I)V

    .line 93
    .line 94
    .line 95
    :cond_4
    return-void
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
.end method

.method public final removeValueIf(Lv3/l;)V
    .locals 5
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-TValue;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getKeys()[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    aget-object v3, v3, v1

    .line 14
    .line 15
    const-string v4, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"

    .line 16
    .line 17
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    aget-object v4, v4, v1

    .line 25
    .line 26
    invoke-interface {p1, v4}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    if-eq v2, v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getKeys()[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    aput-object v3, v4, v2

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    aget-object v4, v4, v1

    .line 55
    .line 56
    aput-object v4, v3, v2

    .line 57
    .line 58
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getSize()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-le p1, v2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getSize()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    move v0, v2

    .line 74
    :goto_1
    if-ge v0, p1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getKeys()[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/4 v3, 0x0

    .line 81
    aput-object v3, v1, v0

    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityArrayMap;->getValues()[Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    aput-object v3, v1, v0

    .line 88
    .line 89
    add-int/lit8 v0, v0, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-static {p0, v2}, Landroidx/compose/runtime/collection/IdentityArrayMap;->access$setSize$p(Landroidx/compose/runtime/collection/IdentityArrayMap;I)V

    .line 93
    .line 94
    .line 95
    :cond_4
    return-void
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
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 15
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKey;TValue;)V"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    iget-object v1, v0, Landroidx/compose/runtime/collection/IdentityArrayMap;->keys:[Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v8, v0, Landroidx/compose/runtime/collection/IdentityArrayMap;->values:[Ljava/lang/Object;

    .line 5
    .line 6
    iget v9, v0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    .line 7
    .line 8
    invoke-direct/range {p0 .. p1}, Landroidx/compose/runtime/collection/IdentityArrayMap;->find(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ltz v2, :cond_0

    .line 13
    .line 14
    aput-object p2, v8, v2

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_0
    const/4 v10, 0x1

    .line 18
    add-int/2addr v2, v10

    .line 19
    neg-int v11, v2

    .line 20
    array-length v2, v1

    .line 21
    if-ne v9, v2, :cond_1

    .line 22
    .line 23
    move v12, v10

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v2, 0x0

    .line 26
    move v12, v2

    .line 27
    :goto_0
    if-eqz v12, :cond_2

    .line 28
    .line 29
    mul-int/lit8 v2, v9, 0x2

    .line 30
    .line 31
    new-array v2, v2, [Ljava/lang/Object;

    .line 32
    .line 33
    move-object v13, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object v13, v1

    .line 36
    :goto_1
    add-int/lit8 v14, v11, 0x1

    .line 37
    .line 38
    invoke-static {v1, v13, v14, v11, v9}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    if-eqz v12, :cond_3

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v6, 0x6

    .line 46
    const/4 v7, 0x0

    .line 47
    move-object v2, v13

    .line 48
    move v5, v11

    .line 49
    invoke-static/range {v1 .. v7}, Lkotlin/collections/l;->K0([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_3
    aput-object p1, v13, v11

    .line 53
    .line 54
    iput-object v13, v0, Landroidx/compose/runtime/collection/IdentityArrayMap;->keys:[Ljava/lang/Object;

    .line 55
    .line 56
    if-eqz v12, :cond_4

    .line 57
    .line 58
    mul-int/lit8 v1, v9, 0x2

    .line 59
    .line 60
    new-array v1, v1, [Ljava/lang/Object;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    move-object v1, v8

    .line 64
    :goto_2
    invoke-static {v8, v1, v14, v11, v9}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    if-eqz v12, :cond_5

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v7, 0x6

    .line 72
    const/4 v9, 0x0

    .line 73
    move-object v2, v8

    .line 74
    move-object v3, v1

    .line 75
    move v6, v11

    .line 76
    move-object v8, v9

    .line 77
    invoke-static/range {v2 .. v8}, Lkotlin/collections/l;->K0([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_5
    aput-object p2, v1, v11

    .line 81
    .line 82
    iput-object v1, v0, Landroidx/compose/runtime/collection/IdentityArrayMap;->values:[Ljava/lang/Object;

    .line 83
    .line 84
    iget v1, v0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    .line 85
    .line 86
    add-int/2addr v1, v10

    .line 87
    iput v1, v0, Landroidx/compose/runtime/collection/IdentityArrayMap;->size:I

    .line 88
    .line 89
    :goto_3
    return-void
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method
