.class final Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "NonMeasureInputs"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;",
        "",
        "textFieldState",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "textStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "singleLine",
        "",
        "softWrap",
        "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZ)V",
        "getSingleLine",
        "()Z",
        "getSoftWrap",
        "getTextFieldState",
        "()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "getTextStyle",
        "()Landroidx/compose/ui/text/TextStyle;",
        "toString",
        "",
        "Companion",
        "foundation_release"
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
.field public static final Companion:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final mutationPolicy:Landroidx/compose/runtime/SnapshotMutationPolicy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/SnapshotMutationPolicy<",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final singleLine:Z

.field private final softWrap:Z

.field private final textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final textStyle:Landroidx/compose/ui/text/TextStyle;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->Companion:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->mutationPolicy:Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
.end method

.method public constructor <init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZ)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->textStyle:Landroidx/compose/ui/text/TextStyle;

    .line 7
    .line 8
    iput-boolean p3, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->singleLine:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->softWrap:Z

    .line 11
    .line 12
    return-void
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
.end method

.method public static final synthetic access$getMutationPolicy$cp()Landroidx/compose/runtime/SnapshotMutationPolicy;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->mutationPolicy:Landroidx/compose/runtime/SnapshotMutationPolicy;

    return-object v0
.end method


# virtual methods
.method public final getSingleLine()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->singleLine:Z

    return v0
.end method

.method public final getSoftWrap()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->softWrap:Z

    return v0
.end method

.method public final getTextFieldState()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    return-object v0
.end method

.method public final getTextStyle()Landroidx/compose/ui/text/TextStyle;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->textStyle:Landroidx/compose/ui/text/TextStyle;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "NonMeasureInputs(textFieldState="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", textStyle="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->textStyle:Landroidx/compose/ui/text/TextStyle;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", singleLine="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-boolean v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->singleLine:Z

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", softWrap="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-boolean v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->softWrap:Z

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 v1, 0x29

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
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
