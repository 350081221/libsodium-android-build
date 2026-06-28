.class public final Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/State;
.implements Landroidx/compose/runtime/snapshots/StateObject;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;,
        Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;,
        Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/State<",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        ">;",
        "Landroidx/compose/runtime/snapshots/StateObject;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003BCDB\u0007\u00a2\u0006\u0004\u0008@\u0010AJ\u0018\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\u000e\u001a\u00020\u000b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0008\u000cH\u0082\u0008J*\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002J&\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J0\u0010%\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020&H\u0016J \u0010,\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020&H\u0016R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010-\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010-\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00084\u0010/\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0016\u0010\'\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010<R\u0014\u0010?\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006E"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "Landroidx/compose/runtime/snapshots/StateObject;",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;",
        "nonMeasureInputs",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;",
        "measureInputs",
        "getOrComputeLayout",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "block",
        "updateCacheIfWritable",
        "",
        "visualText",
        "prevResult",
        "computeLayout",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "textFieldState",
        "Landroidx/compose/ui/text/TextStyle;",
        "textStyle",
        "",
        "singleLine",
        "softWrap",
        "updateNonMeasureInputs",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "layoutDirection",
        "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
        "fontFamilyResolver",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "layoutWithNewMeasureInputs--hBUhpc",
        "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;",
        "layoutWithNewMeasureInputs",
        "Landroidx/compose/runtime/snapshots/StateRecord;",
        "value",
        "prependStateRecord",
        "previous",
        "current",
        "applied",
        "mergeRecords",
        "<set-?>",
        "nonMeasureInputs$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getNonMeasureInputs",
        "()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;",
        "setNonMeasureInputs",
        "(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;)V",
        "measureInputs$delegate",
        "getMeasureInputs",
        "()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;",
        "setMeasureInputs",
        "(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;)V",
        "record",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;",
        "getValue",
        "()Landroidx/compose/ui/text/TextLayoutResult;",
        "getFirstStateRecord",
        "()Landroidx/compose/runtime/snapshots/StateRecord;",
        "firstStateRecord",
        "<init>",
        "()V",
        "CacheRecord",
        "MeasureInputs",
        "NonMeasureInputs",
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
        "SMAP\nTextFieldLayoutStateCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,412:1\n215#1,4:420\n220#1:430\n81#2:413\n107#2,2:414\n81#2:416\n107#2,2:417\n2283#3:419\n2165#3:424\n1714#3:425\n2166#3,2:427\n2165#3:431\n1714#3:432\n2166#3,2:434\n82#4:426\n82#4:433\n1#5:429\n1#5:436\n*S KotlinDebug\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache\n*L\n197#1:420,4\n197#1:430\n63#1:413\n63#1:414,2\n67#1:416\n67#1:417,2\n155#1:419\n197#1:424\n197#1:425\n197#1:427,2\n218#1:431\n218#1:432\n218#1:434,2\n197#1:426\n218#1:433\n197#1:429\n218#1:436\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final measureInputs$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final nonMeasureInputs$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private record:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->Companion:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;->getMutationPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->nonMeasureInputs$delegate:Landroidx/compose/runtime/MutableState;

    .line 16
    .line 17
    sget-object v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->Companion:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs$Companion;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs$Companion;->getMutationPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->measureInputs$delegate:Landroidx/compose/runtime/MutableState;

    .line 28
    .line 29
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    .line 30
    .line 31
    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->record:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    .line 35
    .line 36
    return-void
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

.method private final computeLayout(Ljava/lang/CharSequence;Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;
    .locals 14

    .line 1
    new-instance v6, Landroidx/compose/ui/text/AnnotatedString;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x6

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v0, v6

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/w;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getTextStyle()Landroidx/compose/ui/text/TextStyle;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getFontFamilyResolver()Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getSoftWrap()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    new-instance v12, Landroidx/compose/foundation/text/TextDelegate;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    const/16 v11, 0x2c

    .line 41
    .line 42
    const/4 v13, 0x0

    .line 43
    move-object v0, v12

    .line 44
    move-object v1, v6

    .line 45
    move v6, v10

    .line 46
    move v10, v11

    .line 47
    move-object v11, v13

    .line 48
    invoke-direct/range {v0 .. v11}, Landroidx/compose/foundation/text/TextDelegate;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;ILkotlin/jvm/internal/w;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getConstraints-msEJaDk()J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    move-object/from16 v3, p4

    .line 60
    .line 61
    invoke-virtual {v12, v1, v2, v0, v3}, Landroidx/compose/foundation/text/TextDelegate;->layout-NN6Ew-U(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
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

.method private final getMeasureInputs()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->measureInputs$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;

    .line 8
    .line 9
    return-object v0
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
.end method

.method private final getNonMeasureInputs()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->nonMeasureInputs$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;

    .line 8
    .line 9
    return-object v0
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
.end method

.method private final getOrComputeLayout(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;)Landroidx/compose/ui/text/TextLayoutResult;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getTextFieldState()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, v1, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->record:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    .line 12
    .line 13
    invoke-static {v2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_5

    .line 24
    .line 25
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getVisualText()Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x1

    .line 30
    const/4 v6, 0x0

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-static {v4, v0}, Lkotlin/text/v;->w1(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ne v4, v5, :cond_0

    .line 38
    .line 39
    move v4, v5

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v4, v6

    .line 42
    :goto_0
    if-eqz v4, :cond_5

    .line 43
    .line 44
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getSingleLine()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getSingleLine()Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-ne v4, v7, :cond_5

    .line 53
    .line 54
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getSoftWrap()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getSoftWrap()Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-ne v4, v7, :cond_5

    .line 63
    .line 64
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    if-ne v4, v7, :cond_5

    .line 73
    .line 74
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getDensityValue()F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-interface {v7}, Landroidx/compose/ui/unit/Density;->getDensity()F

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    cmpg-float v4, v4, v7

    .line 87
    .line 88
    if-nez v4, :cond_1

    .line 89
    .line 90
    move v4, v5

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    move v4, v6

    .line 93
    :goto_1
    if-eqz v4, :cond_5

    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getFontScale()F

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-interface {v7}, Landroidx/compose/ui/unit/FontScaling;->getFontScale()F

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    cmpg-float v4, v4, v7

    .line 108
    .line 109
    if-nez v4, :cond_2

    .line 110
    .line 111
    move v4, v5

    .line 112
    goto :goto_2

    .line 113
    :cond_2
    move v4, v6

    .line 114
    :goto_2
    if-eqz v4, :cond_5

    .line 115
    .line 116
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getConstraints-msEJaDk()J

    .line 117
    .line 118
    .line 119
    move-result-wide v7

    .line 120
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getConstraints-msEJaDk()J

    .line 121
    .line 122
    .line 123
    move-result-wide v9

    .line 124
    invoke-static {v7, v8, v9, v10}, Landroidx/compose/ui/unit/Constraints;->equals-impl0(JJ)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_5

    .line 129
    .line 130
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getFontFamilyResolver()Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getFontFamilyResolver()Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-static {v4, v7}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_5

    .line 143
    .line 144
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getTextStyle()Landroidx/compose/ui/text/TextStyle;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getTextStyle()Landroidx/compose/ui/text/TextStyle;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-static {v4, v7}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_3

    .line 157
    .line 158
    return-object v3

    .line 159
    :cond_3
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->getTextStyle()Landroidx/compose/ui/text/TextStyle;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-eqz v2, :cond_4

    .line 164
    .line 165
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getTextStyle()Landroidx/compose/ui/text/TextStyle;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/text/TextStyle;->hasSameDrawAffectingAttributes(Landroidx/compose/ui/text/TextStyle;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-ne v2, v5, :cond_4

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_4
    move v5, v6

    .line 177
    :goto_3
    if-eqz v5, :cond_5

    .line 178
    .line 179
    new-instance v4, Landroidx/compose/ui/text/TextLayoutInput;

    .line 180
    .line 181
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getText()Landroidx/compose/ui/text/AnnotatedString;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getTextStyle()Landroidx/compose/ui/text/TextStyle;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getPlaceholders()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getMaxLines()I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getSoftWrap()Z

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getOverflow-gIe3tQ8()I

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getFontFamilyResolver()Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 246
    .line 247
    .line 248
    move-result-object v15

    .line 249
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getConstraints-msEJaDk()J

    .line 254
    .line 255
    .line 256
    move-result-wide v16

    .line 257
    const/16 v18, 0x0

    .line 258
    .line 259
    move-object v6, v4

    .line 260
    invoke-direct/range {v6 .. v18}, Landroidx/compose/ui/text/TextLayoutInput;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/w;)V

    .line 261
    .line 262
    .line 263
    const-wide/16 v5, 0x0

    .line 264
    .line 265
    const/4 v7, 0x2

    .line 266
    const/4 v8, 0x0

    .line 267
    invoke-static/range {v3 .. v8}, Landroidx/compose/ui/text/TextLayoutResult;->copy-O0kMr_c$default(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/TextLayoutInput;JILjava/lang/Object;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    return-object v0

    .line 272
    :cond_5
    move-object/from16 v2, p1

    .line 273
    .line 274
    move-object/from16 v4, p2

    .line 275
    .line 276
    invoke-direct {v1, v0, v2, v4, v3}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->computeLayout(Ljava/lang/CharSequence;Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-static {v5, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-nez v3, :cond_6

    .line 285
    .line 286
    sget-object v3, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 287
    .line 288
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadOnly()Z

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    if-nez v6, :cond_6

    .line 297
    .line 298
    iget-object v6, v1, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->record:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    .line 299
    .line 300
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    monitor-enter v7

    .line 305
    :try_start_0
    invoke-static {v6, v1, v3}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    check-cast v6, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    .line 310
    .line 311
    invoke-virtual {v6, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setVisualText(Ljava/lang/CharSequence;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getSingleLine()Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    invoke-virtual {v6, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setSingleLine(Z)V

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getSoftWrap()Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    invoke-virtual {v6, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setSoftWrap(Z)V

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;->getTextStyle()Landroidx/compose/ui/text/TextStyle;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v6, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setTextStyle(Landroidx/compose/ui/text/TextStyle;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v6, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getDensityValue()F

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    invoke-virtual {v6, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setDensityValue(F)V

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getFontScale()F

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    invoke-virtual {v6, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setFontScale(F)V

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getConstraints-msEJaDk()J

    .line 357
    .line 358
    .line 359
    move-result-wide v8

    .line 360
    invoke-virtual {v6, v8, v9}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setConstraints-BRTryo0(J)V

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;->getFontFamilyResolver()Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v6, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setFontFamilyResolver(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v6, v5}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;->setLayoutResult(Landroidx/compose/ui/text/TextLayoutResult;)V

    .line 371
    .line 372
    .line 373
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    .line 375
    monitor-exit v7

    .line 376
    invoke-static {v3, v1}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 377
    .line 378
    .line 379
    goto :goto_4

    .line 380
    :catchall_0
    move-exception v0

    .line 381
    monitor-exit v7

    .line 382
    throw v0

    .line 383
    :cond_6
    :goto_4
    return-object v5
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

.method private final setMeasureInputs(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->measureInputs$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

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
.end method

.method private final setNonMeasureInputs(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->nonMeasureInputs$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

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
.end method

.method private final updateCacheIfWritable(Lv3/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadOnly()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->record:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    .line 14
    .line 15
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    monitor-enter v2

    .line 20
    const/4 v3, 0x1

    .line 21
    :try_start_0
    invoke-static {v1, p0, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {p1, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    invoke-static {v3}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 29
    .line 30
    .line 31
    monitor-exit v2

    .line 32
    invoke-static {v3}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    invoke-static {v3}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 41
    .line 42
    .line 43
    monitor-exit v2

    .line 44
    invoke-static {v3}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_0
    :goto_0
    return-void
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


# virtual methods
.method public getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->record:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    return-object v0
.end method

.method public getValue()Landroidx/compose/ui/text/TextLayoutResult;
    .locals 3
    .annotation build Lp4/m;
    .end annotation

    .line 2
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->getNonMeasureInputs()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 3
    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->getMeasureInputs()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    .line 4
    :cond_1
    invoke-direct {p0, v0, v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->getOrComputeLayout(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;)Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v0

    return-object v0
.end method

.method public final layoutWithNewMeasureInputs--hBUhpc(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;
    .locals 8
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/text/font/FontFamily$Resolver;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v7, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v0, v7

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-wide v4, p4

    .line 9
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;-><init>(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/w;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->setMeasureInputs(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->getNonMeasureInputs()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, p1, v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->getOrComputeLayout(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string p2, "Called layoutWithNewMeasureInputs before updateNonMeasureInputs"

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
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

.method public mergeRecords(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 0
    .param p1    # Landroidx/compose/runtime/snapshots/StateRecord;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/snapshots/StateRecord;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/snapshots/StateRecord;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    return-object p3
.end method

.method public prependStateRecord(Landroidx/compose/runtime/snapshots/StateRecord;)V
    .locals 1
    .param p1    # Landroidx/compose/runtime/snapshots/StateRecord;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    .line 7
    .line 8
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->record:Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;

    .line 9
    .line 10
    return-void
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
.end method

.method public final updateNonMeasureInputs(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZ)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lp4/l;
        .end annotation
    .end param

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZ)V

    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;->setNonMeasureInputs(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;)V

    return-void
.end method
