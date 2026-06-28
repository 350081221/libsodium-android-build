.class public final Landroidx/compose/foundation/text2/input/TextFieldBufferKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0001H\u0007\u001a\u000c\u0010\n\u001a\u00020\u0005*\u00020\u0000H\u0007\u001a\u000c\u0010\u000b\u001a\u00020\u0005*\u00020\u0000H\u0007\u001aE\u0010\u0014\u001a\u00020\u0005*\u00020\u000c26\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0011\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u00050\rH\u0087\u0008\u001aE\u0010\u0015\u001a\u00020\u0005*\u00020\u000c26\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0011\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u00050\rH\u0087\u0008\u001a{\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162`\u0010\u001e\u001a\\\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u001a\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u001b\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u001c\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u001d\u0012\u0004\u0012\u00020\u00050\u0019H\u0080\u0008\u00a8\u0006 "
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextFieldBuffer;",
        "",
        "index",
        "",
        "text",
        "Lkotlin/r2;",
        "insert",
        "start",
        "end",
        "delete",
        "placeCursorAtEnd",
        "selectAll",
        "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/text/TextRange;",
        "Lkotlin/v0;",
        "name",
        "range",
        "originalRange",
        "block",
        "forEachChange",
        "forEachChangeReversed",
        "",
        "a",
        "b",
        "Lkotlin/Function4;",
        "aPrefixStart",
        "aSuffixStart",
        "bPrefixStart",
        "bSuffixStart",
        "onFound",
        "findCommonPrefixAndSuffix",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final delete(Landroidx/compose/foundation/text2/input/TextFieldBuffer;II)V
    .locals 1
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldBuffer;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->replace(IILjava/lang/CharSequence;)V

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

.method public static final findCommonPrefixAndSuffix(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lv3/r;)V
    .locals 9
    .param p0    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/r;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "Lv3/r<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-lez v2, :cond_0

    .line 16
    .line 17
    move v2, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v4

    .line 20
    :goto_0
    if-eqz v2, :cond_8

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-lez v2, :cond_1

    .line 27
    .line 28
    move v2, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v2, v4

    .line 31
    :goto_1
    if-eqz v2, :cond_8

    .line 32
    .line 33
    move v2, v4

    .line 34
    move v5, v2

    .line 35
    move v6, v5

    .line 36
    :cond_2
    if-nez v4, :cond_4

    .line 37
    .line 38
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-ne v7, v8, :cond_3

    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v4, v3

    .line 54
    :cond_4
    :goto_2
    if-nez v6, :cond_6

    .line 55
    .line 56
    add-int/lit8 v7, v0, -0x1

    .line 57
    .line 58
    invoke-interface {p0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    add-int/lit8 v8, v1, -0x1

    .line 63
    .line 64
    invoke-interface {p1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-ne v7, v8, :cond_5

    .line 69
    .line 70
    add-int/lit8 v0, v0, -0x1

    .line 71
    .line 72
    add-int/lit8 v1, v1, -0x1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    move v6, v3

    .line 76
    :cond_6
    :goto_3
    if-ge v2, v0, :cond_7

    .line 77
    .line 78
    if-ge v5, v1, :cond_7

    .line 79
    .line 80
    if-eqz v4, :cond_2

    .line 81
    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    :cond_7
    move v4, v2

    .line 85
    goto :goto_4

    .line 86
    :cond_8
    move v5, v4

    .line 87
    :goto_4
    if-lt v4, v0, :cond_9

    .line 88
    .line 89
    if-lt v5, v1, :cond_9

    .line 90
    .line 91
    return-void

    .line 92
    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {p2, p0, p1, v0, v1}, Lv3/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    return-void
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

.method public static final forEachChange(Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;Lv3/p;)V
    .locals 4
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/text/TextRange;",
            "-",
            "Landroidx/compose/ui/text/TextRange;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getChangeCount()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getRange--jx7JFs(I)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getOriginalRange--jx7JFs(I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {p1, v1, v2}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
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

.method public static final forEachChangeReversed(Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;Lv3/p;)V
    .locals 4
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/text/TextRange;",
            "-",
            "Landroidx/compose/ui/text/TextRange;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getChangeCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getRange--jx7JFs(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getOriginalRange--jx7JFs(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {p1, v1, v2}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
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

.method public static final insert(Landroidx/compose/foundation/text2/input/TextFieldBuffer;ILjava/lang/String;)V
    .locals 0
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldBuffer;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    invoke-virtual {p0, p1, p1, p2}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->replace(IILjava/lang/CharSequence;)V

    return-void
.end method

.method public static final placeCursorAtEnd(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V
    .locals 1
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldBuffer;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getLength()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->placeCursorBeforeCharAt(I)V

    return-void
.end method

.method public static final selectAll(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V
    .locals 2
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldBuffer;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getLength()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->selectCharsIn-5zc-tL8(J)V

    return-void
.end method
