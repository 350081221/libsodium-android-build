.class final Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0010\u0018\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\u0008\u0010\u000c\u001a\u00020\u000bH\u0016J\u000c\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;",
        "Landroidx/compose/ui/node/ModifierNodeElement;",
        "Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;",
        "create",
        "node",
        "Lkotlin/r2;",
        "update",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "inspectableProperties",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "state",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "value",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "Lkotlin/Function1;",
        "onValueChanged",
        "Lv3/l;",
        "writeSelectionFromTextFieldValue",
        "Z",
        "<init>",
        "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Z)V",
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
.field private final onValueChanged:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final state:Landroidx/compose/foundation/text2/input/TextFieldState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final value:Landroidx/compose/ui/text/input/TextFieldValue;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final writeSelectionFromTextFieldValue:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Z)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/input/TextFieldValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/TextFieldState;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/r2;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->value:Landroidx/compose/ui/text/input/TextFieldValue;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->onValueChanged:Lv3/l;

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->writeSelectionFromTextFieldValue:Z

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


# virtual methods
.method public create()Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->onValueChanged:Lv3/l;

    iget-boolean v3, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->writeSelectionFromTextFieldValue:Z

    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;-><init>(Landroidx/compose/foundation/text2/input/TextFieldState;Lv3/l;Z)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->create()Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/platform/InspectorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public update(Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;)V
    .locals 2
    .param p1    # Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->value:Landroidx/compose/ui/text/input/TextFieldValue;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->onValueChanged:Lv3/l;

    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;->update(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;->update(Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;)V

    return-void
.end method
