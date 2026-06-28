.class final Landroidx/compose/foundation/text2/input/MaxLengthFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/text2/input/InputTransformation;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0007\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002H\u00c2\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c2\u0003J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0008\u0010\r\u001a\u00020\u000cH\u0016J\u001d\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/MaxLengthFilter;",
        "Landroidx/compose/foundation/text2/input/InputTransformation;",
        "",
        "component1",
        "",
        "component2",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "originalValue",
        "Landroidx/compose/foundation/text2/input/TextFieldBuffer;",
        "valueWithChanges",
        "Lkotlin/r2;",
        "transformInput",
        "",
        "toString",
        "maxLength",
        "inCodepoints",
        "copy",
        "hashCode",
        "",
        "other",
        "equals",
        "I",
        "Z",
        "<init>",
        "(IZ)V",
        "foundation_release"
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
        "SMAP\nMaxLengthTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaxLengthTransformation.kt\nandroidx/compose/foundation/text2/input/MaxLengthFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"
    }
.end annotation


# instance fields
.field private final inCodepoints:Z

.field private final maxLength:I


# direct methods
.method public constructor <init>(IZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->maxLength:I

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->inCodepoints:Z

    .line 7
    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-eqz p2, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v0, "maxLength must be at least zero, was "

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p2
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

.method private final component1()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->maxLength:I

    return v0
.end method

.method private final component2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->inCodepoints:Z

    return v0
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/text2/input/MaxLengthFilter;IZILjava/lang/Object;)Landroidx/compose/foundation/text2/input/MaxLengthFilter;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->maxLength:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->inCodepoints:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->copy(IZ)Landroidx/compose/foundation/text2/input/MaxLengthFilter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(IZ)Landroidx/compose/foundation/text2/input/MaxLengthFilter;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;

    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/text2/input/MaxLengthFilter;-><init>(IZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/text2/input/MaxLengthFilter;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/text2/input/MaxLengthFilter;

    iget v1, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->maxLength:I

    iget v3, p1, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->maxLength:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->inCodepoints:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->inCodepoints:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->maxLength:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->inCodepoints:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->inCodepoints:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "maxLengthInCodepoints"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "maxLengthInChars"

    .line 9
    .line 10
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "InputTransformation."

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, "(maxLength="

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v0, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->maxLength:I

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v0, 0x29

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
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

.method public transformInput(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/TextFieldBuffer;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-boolean p1, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->inCodepoints:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getCodepointLength()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getLength()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    :goto_0
    iget v0, p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;->maxLength:I

    .line 15
    .line 16
    if-le p1, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->revertAllChanges()V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
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
