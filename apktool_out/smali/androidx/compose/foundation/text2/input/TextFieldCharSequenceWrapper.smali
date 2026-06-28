.class final Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/text2/input/TextFieldCharSequence;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000c\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0019\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0019\u001a\u00020\u0008\u0012\u0006\u0010\'\u001a\u00020\u001b\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008)\u0010*J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0008\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0008H\u0016J&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u0013\u0010\u0017\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\u0008\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0019\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\"\u0010 \u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006+"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "",
        "index",
        "",
        "get",
        "startIndex",
        "endIndex",
        "",
        "subSequence",
        "",
        "toString",
        "other",
        "",
        "contentEquals",
        "",
        "destination",
        "destinationOffset",
        "sourceStartIndex",
        "sourceEndIndex",
        "Lkotlin/r2;",
        "toCharArray",
        "",
        "equals",
        "hashCode",
        "text",
        "Ljava/lang/CharSequence;",
        "Landroidx/compose/ui/text/TextRange;",
        "selectionInChars",
        "J",
        "getSelectionInChars-d9O1mEE",
        "()J",
        "compositionInChars",
        "Landroidx/compose/ui/text/TextRange;",
        "getCompositionInChars-MzsxiRA",
        "()Landroidx/compose/ui/text/TextRange;",
        "getLength",
        "()I",
        "length",
        "selection",
        "composition",
        "<init>",
        "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/w;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final compositionInChars:Landroidx/compose/ui/text/TextRange;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final selectionInChars:J

.field private final text:Ljava/lang/CharSequence;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->text:Ljava/lang/CharSequence;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p2, p3, v1, v0}, Landroidx/compose/ui/text/TextRangeKt;->coerceIn-8ffj60Q(JII)J

    .line 12
    .line 13
    .line 14
    move-result-wide p2

    .line 15
    iput-wide p2, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->selectionInChars:J

    .line 16
    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    invoke-virtual {p4}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p2, p3, v1, p1}, Landroidx/compose/ui/text/TextRangeKt;->coerceIn-8ffj60Q(JII)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    :goto_0
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->compositionInChars:Landroidx/compose/ui/text/TextRange;

    .line 38
    .line 39
    return-void
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

.method public synthetic constructor <init>(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;-><init>(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)V

    return-void
.end method


# virtual methods
.method public final bridge charAt(I)C
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->get(I)C

    move-result p1

    return p1
.end method

.method public contentEquals(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->text:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lkotlin/text/v;->w1(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    const-class v2, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eq v2, v3, :cond_2

    .line 16
    .line 17
    return v1

    .line 18
    :cond_2
    check-cast p1, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->getSelectionInChars-d9O1mEE()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->getSelectionInChars-d9O1mEE()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    return v1

    .line 35
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_4

    .line 48
    .line 49
    return v1

    .line 50
    :cond_4
    iget-object p1, p1, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->text:Ljava/lang/CharSequence;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_5

    .line 57
    .line 58
    return v1

    .line 59
    :cond_5
    return v0
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

.method public get(I)C
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->text:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method

.method public getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->compositionInChars:Landroidx/compose/ui/text/TextRange;

    return-object v0
.end method

.method public getLength()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->text:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0
.end method

.method public getSelectionInChars-d9O1mEE()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->selectionInChars:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->text:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->getSelectionInChars-d9O1mEE()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->hashCode-impl(J)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v0, v1

    .line 18
    mul-int/lit8 v0, v0, 0x1f

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->hashCode-impl(J)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x0

    .line 36
    :goto_0
    add-int/2addr v0, v1

    .line 37
    return v0
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

.method public final bridge length()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->getLength()I

    move-result v0

    return v0
.end method

.method public subSequence(II)Ljava/lang/CharSequence;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->text:Ljava/lang/CharSequence;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final toCharArray([CIII)V
    .locals 1
    .param p1    # [C
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->text:Ljava/lang/CharSequence;

    invoke-static {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/internal/ToCharArray_androidKt;->toCharArray(Ljava/lang/CharSequence;[CIII)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;->text:Ljava/lang/CharSequence;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
