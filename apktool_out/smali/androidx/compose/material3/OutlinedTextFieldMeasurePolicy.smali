.class final Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008\'\u0010(J<\u0010\n\u001a\u00020\u0006*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0008H\u0002J<\u0010\u000c\u001a\u00020\u0006*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0008H\u0002J,\u0010\u0014\u001a\u00020\u0011*\u00020\r2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u0006*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\"\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\"\u0010\u0017\u001a\u00020\u0006*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0018\u001a\u00020\u0006*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006)"
    }
    d2 = {
        "Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "measurables",
        "",
        "height",
        "Lkotlin/Function2;",
        "intrinsicMeasurer",
        "intrinsicWidth",
        "width",
        "intrinsicHeight",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "Landroidx/compose/ui/layout/Measurable;",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;",
        "measure",
        "maxIntrinsicHeight",
        "minIntrinsicHeight",
        "maxIntrinsicWidth",
        "minIntrinsicWidth",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/geometry/Size;",
        "Lkotlin/r2;",
        "onLabelMeasured",
        "Lv3/l;",
        "",
        "singleLine",
        "Z",
        "",
        "animationProgress",
        "F",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "paddingValues",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "<init>",
        "(Lv3/l;ZFLandroidx/compose/foundation/layout/PaddingValues;)V",
        "material3_release"
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
        "SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1156:1\n116#2,2:1157\n33#2,6:1159\n118#2:1165\n116#2,2:1166\n33#2,6:1168\n118#2:1174\n116#2,2:1175\n33#2,6:1177\n118#2:1183\n116#2,2:1184\n33#2,6:1186\n118#2:1192\n116#2,2:1193\n33#2,6:1195\n118#2:1201\n116#2,2:1202\n33#2,6:1204\n118#2:1210\n544#2,2:1211\n33#2,6:1213\n546#2:1219\n116#2,2:1220\n33#2,6:1222\n118#2:1228\n544#2,2:1229\n33#2,6:1231\n546#2:1237\n544#2,2:1238\n33#2,6:1240\n546#2:1246\n116#2,2:1247\n33#2,6:1249\n118#2:1255\n116#2,2:1256\n33#2,6:1258\n118#2:1264\n116#2,2:1265\n33#2,6:1267\n118#2:1273\n116#2,2:1274\n33#2,6:1276\n118#2:1282\n116#2,2:1283\n33#2,6:1285\n118#2:1291\n116#2,2:1292\n33#2,6:1294\n118#2:1300\n116#2,2:1301\n33#2,6:1303\n118#2:1309\n116#2,2:1310\n33#2,6:1312\n118#2:1318\n116#2,2:1319\n33#2,6:1321\n118#2:1327\n116#2,2:1328\n33#2,6:1330\n118#2:1336\n116#2,2:1337\n33#2,6:1339\n118#2:1345\n544#2,2:1346\n33#2,6:1348\n546#2:1354\n116#2,2:1355\n33#2,6:1357\n118#2:1363\n116#2,2:1364\n33#2,6:1366\n118#2:1372\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n*L\n653#1:1157,2\n653#1:1159,6\n653#1:1165\n660#1:1166,2\n660#1:1168,6\n660#1:1174\n666#1:1175,2\n666#1:1177,6\n666#1:1183\n672#1:1184,2\n672#1:1186,6\n672#1:1192\n690#1:1193,2\n690#1:1195,6\n690#1:1201\n697#1:1202,2\n697#1:1204,6\n697#1:1210\n711#1:1211,2\n711#1:1213,6\n711#1:1219\n715#1:1220,2\n715#1:1222,6\n715#1:1228\n763#1:1229,2\n763#1:1231,6\n763#1:1237\n835#1:1238,2\n835#1:1240,6\n835#1:1246\n836#1:1247,2\n836#1:1249,6\n836#1:1255\n839#1:1256,2\n839#1:1258,6\n839#1:1264\n842#1:1265,2\n842#1:1267,6\n842#1:1273\n845#1:1274,2\n845#1:1276,6\n845#1:1282\n848#1:1283,2\n848#1:1285,6\n848#1:1291\n851#1:1292,2\n851#1:1294,6\n851#1:1300\n875#1:1301,2\n875#1:1303,6\n875#1:1309\n881#1:1310,2\n881#1:1312,6\n881#1:1318\n888#1:1319,2\n888#1:1321,6\n888#1:1327\n892#1:1328,2\n892#1:1330,6\n892#1:1336\n899#1:1337,2\n899#1:1339,6\n899#1:1345\n908#1:1346,2\n908#1:1348,6\n908#1:1354\n910#1:1355,2\n910#1:1357,6\n910#1:1363\n914#1:1364,2\n914#1:1366,6\n914#1:1372\n*E\n"
    }
.end annotation


# instance fields
.field private final animationProgress:F

.field private final onLabelMeasured:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/geometry/Size;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final paddingValues:Landroidx/compose/foundation/layout/PaddingValues;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final singleLine:Z


# direct methods
.method public constructor <init>(Lv3/l;ZFLandroidx/compose/foundation/layout/PaddingValues;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/geometry/Size;",
            "Lkotlin/r2;",
            ">;ZF",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->onLabelMeasured:Lv3/l;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->singleLine:Z

    .line 7
    .line 8
    iput p3, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

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

.method public static final synthetic access$getAnimationProgress$p(Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;)F
    .locals 0

    iget p0, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    return p0
.end method

.method public static final synthetic access$getPaddingValues$p(Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;)Landroidx/compose/foundation/layout/PaddingValues;
    .locals 0

    iget-object p0, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    return-object p0
.end method

.method public static final synthetic access$getSingleLine$p(Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->singleLine:Z

    return p0
.end method

.method private final intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILv3/p;)I
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v6, 0x0

    .line 14
    :goto_0
    if-ge v6, v4, :cond_1

    .line 15
    .line 16
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    move-object v9, v8

    .line 21
    check-cast v9, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 22
    .line 23
    invoke-static {v9}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    const-string v10, "Leading"

    .line 28
    .line 29
    invoke-static {v9, v10}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    if-eqz v9, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v8, 0x0

    .line 40
    :goto_1
    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 41
    .line 42
    const v4, 0x7fffffff

    .line 43
    .line 44
    .line 45
    if-eqz v8, :cond_2

    .line 46
    .line 47
    invoke-interface {v8, v4}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-static {v2, v6}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-interface {v3, v8, v9}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    check-cast v8, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v6, v2

    .line 71
    const/4 v8, 0x0

    .line 72
    :goto_2
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    const/4 v10, 0x0

    .line 77
    :goto_3
    if-ge v10, v9, :cond_4

    .line 78
    .line 79
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    move-object v12, v11

    .line 84
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 85
    .line 86
    invoke-static {v12}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    const-string v13, "Trailing"

    .line 91
    .line 92
    invoke-static {v12, v13}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    if-eqz v12, :cond_3

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    const/4 v11, 0x0

    .line 103
    :goto_4
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 104
    .line 105
    if-eqz v11, :cond_5

    .line 106
    .line 107
    invoke-interface {v11, v4}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    invoke-static {v6, v9}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-interface {v3, v11, v9}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    check-cast v9, Ljava/lang/Number;

    .line 124
    .line 125
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    goto :goto_5

    .line 130
    :cond_5
    const/4 v9, 0x0

    .line 131
    :goto_5
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    const/4 v11, 0x0

    .line 136
    :goto_6
    if-ge v11, v10, :cond_7

    .line 137
    .line 138
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    move-object v13, v12

    .line 143
    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 144
    .line 145
    invoke-static {v13}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    const-string v14, "Label"

    .line 150
    .line 151
    invoke-static {v13, v14}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v13, :cond_6

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_7
    const/4 v12, 0x0

    .line 162
    :goto_7
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 163
    .line 164
    if-eqz v12, :cond_8

    .line 165
    .line 166
    iget v10, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 167
    .line 168
    invoke-static {v6, v2, v10}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    invoke-interface {v3, v12, v10}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    check-cast v10, Ljava/lang/Number;

    .line 181
    .line 182
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    move v13, v10

    .line 187
    goto :goto_8

    .line 188
    :cond_8
    const/4 v13, 0x0

    .line 189
    :goto_8
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    const/4 v11, 0x0

    .line 194
    :goto_9
    if-ge v11, v10, :cond_a

    .line 195
    .line 196
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    move-object v14, v12

    .line 201
    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 202
    .line 203
    invoke-static {v14}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    const-string v15, "Prefix"

    .line 208
    .line 209
    invoke-static {v14, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v14

    .line 213
    if-eqz v14, :cond_9

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_a
    const/4 v12, 0x0

    .line 220
    :goto_a
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 221
    .line 222
    if-eqz v12, :cond_b

    .line 223
    .line 224
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-interface {v3, v12, v10}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    check-cast v10, Ljava/lang/Number;

    .line 233
    .line 234
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    invoke-interface {v12, v4}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    invoke-static {v6, v11}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    goto :goto_b

    .line 247
    :cond_b
    const/4 v10, 0x0

    .line 248
    :goto_b
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    const/4 v12, 0x0

    .line 253
    :goto_c
    if-ge v12, v11, :cond_d

    .line 254
    .line 255
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v14

    .line 259
    move-object v15, v14

    .line 260
    check-cast v15, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 261
    .line 262
    invoke-static {v15}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v15

    .line 266
    const-string v5, "Suffix"

    .line 267
    .line 268
    invoke-static {v15, v5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_c

    .line 273
    .line 274
    goto :goto_d

    .line 275
    :cond_c
    add-int/lit8 v12, v12, 0x1

    .line 276
    .line 277
    goto :goto_c

    .line 278
    :cond_d
    const/4 v14, 0x0

    .line 279
    :goto_d
    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 280
    .line 281
    if-eqz v14, :cond_e

    .line 282
    .line 283
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-interface {v3, v14, v5}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    check-cast v5, Ljava/lang/Number;

    .line 292
    .line 293
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    invoke-interface {v14, v4}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    invoke-static {v6, v4}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$substractConstraintSafely(II)I

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    move v11, v5

    .line 306
    goto :goto_e

    .line 307
    :cond_e
    const/4 v11, 0x0

    .line 308
    :goto_e
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    const/4 v5, 0x0

    .line 313
    :goto_f
    if-ge v5, v4, :cond_16

    .line 314
    .line 315
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    move-object v14, v12

    .line 320
    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 321
    .line 322
    invoke-static {v14}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v14

    .line 326
    const-string v15, "TextField"

    .line 327
    .line 328
    invoke-static {v14, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v14

    .line 332
    if-eqz v14, :cond_15

    .line 333
    .line 334
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    invoke-interface {v3, v12, v4}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    check-cast v4, Ljava/lang/Number;

    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    const/4 v5, 0x0

    .line 353
    :goto_10
    if-ge v5, v4, :cond_10

    .line 354
    .line 355
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v14

    .line 359
    move-object v15, v14

    .line 360
    check-cast v15, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 361
    .line 362
    invoke-static {v15}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v15

    .line 366
    const-string v7, "Hint"

    .line 367
    .line 368
    invoke-static {v15, v7}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v7

    .line 372
    if-eqz v7, :cond_f

    .line 373
    .line 374
    goto :goto_11

    .line 375
    :cond_f
    add-int/lit8 v5, v5, 0x1

    .line 376
    .line 377
    goto :goto_10

    .line 378
    :cond_10
    const/4 v14, 0x0

    .line 379
    :goto_11
    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 380
    .line 381
    if-eqz v14, :cond_11

    .line 382
    .line 383
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    invoke-interface {v3, v14, v4}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    check-cast v4, Ljava/lang/Number;

    .line 392
    .line 393
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    move v14, v4

    .line 398
    goto :goto_12

    .line 399
    :cond_11
    const/4 v14, 0x0

    .line 400
    :goto_12
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    const/4 v5, 0x0

    .line 405
    :goto_13
    if-ge v5, v4, :cond_13

    .line 406
    .line 407
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    move-object v7, v6

    .line 412
    check-cast v7, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 413
    .line 414
    invoke-static {v7}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    const-string v15, "Supporting"

    .line 419
    .line 420
    invoke-static {v7, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    if-eqz v7, :cond_12

    .line 425
    .line 426
    move-object v7, v6

    .line 427
    goto :goto_14

    .line 428
    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 429
    .line 430
    goto :goto_13

    .line 431
    :cond_13
    const/4 v7, 0x0

    .line 432
    :goto_14
    check-cast v7, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 433
    .line 434
    if-eqz v7, :cond_14

    .line 435
    .line 436
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-interface {v3, v7, v1}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    check-cast v1, Ljava/lang/Number;

    .line 445
    .line 446
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    move v15, v5

    .line 451
    goto :goto_15

    .line 452
    :cond_14
    const/4 v15, 0x0

    .line 453
    :goto_15
    iget v1, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 454
    .line 455
    invoke-static {}, Landroidx/compose/material3/TextFieldImplKt;->getZeroConstraints()J

    .line 456
    .line 457
    .line 458
    move-result-wide v17

    .line 459
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/unit/Density;->getDensity()F

    .line 460
    .line 461
    .line 462
    move-result v19

    .line 463
    iget-object v2, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 464
    .line 465
    move/from16 v16, v1

    .line 466
    .line 467
    move-object/from16 v20, v2

    .line 468
    .line 469
    invoke-static/range {v8 .. v20}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$calculateHeight-mKXJcVc(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    return v1

    .line 474
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 475
    .line 476
    goto/16 :goto_f

    .line 477
    .line 478
    :cond_16
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 479
    .line 480
    const-string v2, "Collection contains no element matching the predicate."

    .line 481
    .line 482
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    throw v1
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
.end method

.method private final intrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILv3/p;)I
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ge v5, v3, :cond_13

    .line 14
    .line 15
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    move-object v7, v6

    .line 20
    check-cast v7, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 21
    .line 22
    invoke-static {v7}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const-string v8, "TextField"

    .line 27
    .line 28
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_12

    .line 33
    .line 34
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v2, v6, v3}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    move v5, v4

    .line 53
    :goto_1
    const/4 v6, 0x0

    .line 54
    if-ge v5, v3, :cond_1

    .line 55
    .line 56
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    move-object v8, v7

    .line 61
    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 62
    .line 63
    invoke-static {v8}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    const-string v10, "Label"

    .line 68
    .line 69
    invoke-static {v8, v10}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_0

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v7, v6

    .line 80
    :goto_2
    check-cast v7, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 81
    .line 82
    if-eqz v7, :cond_2

    .line 83
    .line 84
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {v2, v7, v3}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    move v10, v3

    .line 99
    goto :goto_3

    .line 100
    :cond_2
    move v10, v4

    .line 101
    :goto_3
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    move v5, v4

    .line 106
    :goto_4
    if-ge v5, v3, :cond_4

    .line 107
    .line 108
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    move-object v8, v7

    .line 113
    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 114
    .line 115
    invoke-static {v8}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    const-string v11, "Trailing"

    .line 120
    .line 121
    invoke-static {v8, v11}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_3

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_4
    move-object v7, v6

    .line 132
    :goto_5
    check-cast v7, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 133
    .line 134
    if-eqz v7, :cond_5

    .line 135
    .line 136
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-interface {v2, v7, v3}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Ljava/lang/Number;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    goto :goto_6

    .line 151
    :cond_5
    move v3, v4

    .line 152
    :goto_6
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    move v7, v4

    .line 157
    :goto_7
    if-ge v7, v5, :cond_7

    .line 158
    .line 159
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    move-object v11, v8

    .line 164
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 165
    .line 166
    invoke-static {v11}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    const-string v12, "Leading"

    .line 171
    .line 172
    invoke-static {v11, v12}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    if-eqz v11, :cond_6

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_7
    move-object v8, v6

    .line 183
    :goto_8
    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 184
    .line 185
    if-eqz v8, :cond_8

    .line 186
    .line 187
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-interface {v2, v8, v5}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    check-cast v5, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    goto :goto_9

    .line 202
    :cond_8
    move v5, v4

    .line 203
    :goto_9
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    move v8, v4

    .line 208
    :goto_a
    if-ge v8, v7, :cond_a

    .line 209
    .line 210
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    move-object v12, v11

    .line 215
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 216
    .line 217
    invoke-static {v12}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    const-string v13, "Prefix"

    .line 222
    .line 223
    invoke-static {v12, v13}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    if-eqz v12, :cond_9

    .line 228
    .line 229
    goto :goto_b

    .line 230
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 231
    .line 232
    goto :goto_a

    .line 233
    :cond_a
    move-object v11, v6

    .line 234
    :goto_b
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 235
    .line 236
    if-eqz v11, :cond_b

    .line 237
    .line 238
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-interface {v2, v11, v7}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    check-cast v7, Ljava/lang/Number;

    .line 247
    .line 248
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    goto :goto_c

    .line 253
    :cond_b
    move v7, v4

    .line 254
    :goto_c
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    move v11, v4

    .line 259
    :goto_d
    if-ge v11, v8, :cond_d

    .line 260
    .line 261
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    move-object v13, v12

    .line 266
    check-cast v13, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 267
    .line 268
    invoke-static {v13}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    const-string v14, "Suffix"

    .line 273
    .line 274
    invoke-static {v13, v14}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v13

    .line 278
    if-eqz v13, :cond_c

    .line 279
    .line 280
    goto :goto_e

    .line 281
    :cond_c
    add-int/lit8 v11, v11, 0x1

    .line 282
    .line 283
    goto :goto_d

    .line 284
    :cond_d
    move-object v12, v6

    .line 285
    :goto_e
    check-cast v12, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 286
    .line 287
    if-eqz v12, :cond_e

    .line 288
    .line 289
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    invoke-interface {v2, v12, v8}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    check-cast v8, Ljava/lang/Number;

    .line 298
    .line 299
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    goto :goto_f

    .line 304
    :cond_e
    move v8, v4

    .line 305
    :goto_f
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    move v12, v4

    .line 310
    :goto_10
    if-ge v12, v11, :cond_10

    .line 311
    .line 312
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v13

    .line 316
    move-object v14, v13

    .line 317
    check-cast v14, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 318
    .line 319
    invoke-static {v14}, Landroidx/compose/material3/TextFieldImplKt;->getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    const-string v15, "Hint"

    .line 324
    .line 325
    invoke-static {v14, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v14

    .line 329
    if-eqz v14, :cond_f

    .line 330
    .line 331
    move-object v6, v13

    .line 332
    goto :goto_11

    .line 333
    :cond_f
    add-int/lit8 v12, v12, 0x1

    .line 334
    .line 335
    goto :goto_10

    .line 336
    :cond_10
    :goto_11
    check-cast v6, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 337
    .line 338
    if-eqz v6, :cond_11

    .line 339
    .line 340
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-interface {v2, v6, v1}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    check-cast v1, Ljava/lang/Number;

    .line 349
    .line 350
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    :cond_11
    move v11, v4

    .line 355
    iget v12, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 356
    .line 357
    invoke-static {}, Landroidx/compose/material3/TextFieldImplKt;->getZeroConstraints()J

    .line 358
    .line 359
    .line 360
    move-result-wide v13

    .line 361
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/unit/Density;->getDensity()F

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    iget-object v1, v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 366
    .line 367
    move v6, v3

    .line 368
    move-object/from16 v16, v1

    .line 369
    .line 370
    invoke-static/range {v5 .. v16}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$calculateWidth-DHJA7U0(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    return v1

    .line 375
    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 376
    .line 377
    goto/16 :goto_0

    .line 378
    .line 379
    :cond_13
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 380
    .line 381
    const-string v2, "Collection contains no element matching the predicate."

    .line 382
    .line 383
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v1
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
.end method


# virtual methods
.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    sget-object v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILv3/p;)I

    move-result p1

    return p1
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    sget-object v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->intrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILv3/p;)I

    move-result p1

    return p1
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 48
    .param p1    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iget-object v1, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 8
    .line 9
    invoke-interface {v1}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/16 v8, 0xa

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    move-wide/from16 v2, p3

    .line 25
    .line 26
    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    move v6, v5

    .line 35
    :goto_0
    if-ge v6, v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    move-object v9, v8

    .line 42
    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .line 43
    .line 44
    invoke-static {v9}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    const-string v10, "Leading"

    .line 49
    .line 50
    invoke-static {v9, v10}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    if-eqz v9, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v8, 0x0

    .line 61
    :goto_1
    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    .line 62
    .line 63
    if-eqz v8, :cond_2

    .line 64
    .line 65
    invoke-interface {v8, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const/4 v4, 0x0

    .line 71
    :goto_2
    invoke-static {v4}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    add-int/2addr v6, v5

    .line 76
    invoke-static {v4}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    move v10, v5

    .line 89
    :goto_3
    if-ge v10, v9, :cond_4

    .line 90
    .line 91
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    move-object v12, v11

    .line 96
    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    .line 97
    .line 98
    invoke-static {v12}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    const-string v13, "Trailing"

    .line 103
    .line 104
    invoke-static {v12, v13}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    if-eqz v12, :cond_3

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    const/4 v11, 0x0

    .line 115
    :goto_4
    check-cast v11, Landroidx/compose/ui/layout/Measurable;

    .line 116
    .line 117
    if-eqz v11, :cond_5

    .line 118
    .line 119
    neg-int v9, v6

    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    const/16 v20, 0x2

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    move-wide/from16 v16, v2

    .line 127
    .line 128
    move/from16 v18, v9

    .line 129
    .line 130
    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v9

    .line 134
    invoke-interface {v11, v9, v10}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    goto :goto_5

    .line 139
    :cond_5
    const/4 v9, 0x0

    .line 140
    :goto_5
    invoke-static {v9}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    add-int/2addr v6, v10

    .line 145
    invoke-static {v9}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    move v11, v5

    .line 158
    :goto_6
    if-ge v11, v10, :cond_7

    .line 159
    .line 160
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    move-object v13, v12

    .line 165
    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .line 166
    .line 167
    invoke-static {v13}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    const-string v5, "Prefix"

    .line 172
    .line 173
    invoke-static {v13, v5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_6

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 181
    .line 182
    const/4 v5, 0x0

    .line 183
    goto :goto_6

    .line 184
    :cond_7
    const/4 v12, 0x0

    .line 185
    :goto_7
    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    .line 186
    .line 187
    if-eqz v12, :cond_8

    .line 188
    .line 189
    neg-int v5, v6

    .line 190
    const/16 v19, 0x0

    .line 191
    .line 192
    const/16 v20, 0x2

    .line 193
    .line 194
    const/16 v21, 0x0

    .line 195
    .line 196
    move-wide/from16 v16, v2

    .line 197
    .line 198
    move/from16 v18, v5

    .line 199
    .line 200
    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    .line 201
    .line 202
    .line 203
    move-result-wide v10

    .line 204
    invoke-interface {v12, v10, v11}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    goto :goto_8

    .line 209
    :cond_8
    const/4 v5, 0x0

    .line 210
    :goto_8
    invoke-static {v5}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    add-int/2addr v6, v10

    .line 215
    invoke-static {v5}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    const/4 v11, 0x0

    .line 228
    :goto_9
    if-ge v11, v10, :cond_a

    .line 229
    .line 230
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    move-object v13, v12

    .line 235
    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .line 236
    .line 237
    invoke-static {v13}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v13

    .line 241
    const-string v7, "Suffix"

    .line 242
    .line 243
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    if-eqz v7, :cond_9

    .line 248
    .line 249
    goto :goto_a

    .line 250
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_a
    const/4 v12, 0x0

    .line 254
    :goto_a
    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    .line 255
    .line 256
    if-eqz v12, :cond_b

    .line 257
    .line 258
    neg-int v7, v6

    .line 259
    const/16 v19, 0x0

    .line 260
    .line 261
    const/16 v20, 0x2

    .line 262
    .line 263
    const/16 v21, 0x0

    .line 264
    .line 265
    move-wide/from16 v16, v2

    .line 266
    .line 267
    move/from16 v18, v7

    .line 268
    .line 269
    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    .line 270
    .line 271
    .line 272
    move-result-wide v10

    .line 273
    invoke-interface {v12, v10, v11}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    goto :goto_b

    .line 278
    :cond_b
    const/4 v7, 0x0

    .line 279
    :goto_b
    invoke-static {v7}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    add-int/2addr v6, v10

    .line 284
    invoke-static {v7}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    iget-object v10, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 293
    .line 294
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    invoke-interface {v10, v11}, Landroidx/compose/foundation/layout/PaddingValues;->calculateLeftPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 299
    .line 300
    .line 301
    move-result v10

    .line 302
    invoke-interface {v15, v10}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 303
    .line 304
    .line 305
    move-result v10

    .line 306
    iget-object v11, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 307
    .line 308
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 309
    .line 310
    .line 311
    move-result-object v12

    .line 312
    invoke-interface {v11, v12}, Landroidx/compose/foundation/layout/PaddingValues;->calculateRightPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 313
    .line 314
    .line 315
    move-result v11

    .line 316
    invoke-interface {v15, v11}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 317
    .line 318
    .line 319
    move-result v11

    .line 320
    add-int/2addr v10, v11

    .line 321
    neg-int v6, v6

    .line 322
    sub-int v11, v6, v10

    .line 323
    .line 324
    neg-int v10, v10

    .line 325
    iget v12, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 326
    .line 327
    invoke-static {v11, v10, v12}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    .line 328
    .line 329
    .line 330
    move-result v10

    .line 331
    neg-int v11, v1

    .line 332
    invoke-static {v2, v3, v10, v11}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    .line 333
    .line 334
    .line 335
    move-result-wide v12

    .line 336
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    move-wide/from16 v16, v2

    .line 341
    .line 342
    const/4 v2, 0x0

    .line 343
    :goto_c
    if-ge v2, v10, :cond_d

    .line 344
    .line 345
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    move-object/from16 v18, v3

    .line 350
    .line 351
    check-cast v18, Landroidx/compose/ui/layout/Measurable;

    .line 352
    .line 353
    move-object/from16 v19, v3

    .line 354
    .line 355
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    move/from16 v18, v10

    .line 360
    .line 361
    const-string v10, "Label"

    .line 362
    .line 363
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    if-eqz v3, :cond_c

    .line 368
    .line 369
    move-object/from16 v3, v19

    .line 370
    .line 371
    goto :goto_d

    .line 372
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 373
    .line 374
    move/from16 v10, v18

    .line 375
    .line 376
    goto :goto_c

    .line 377
    :cond_d
    const/4 v3, 0x0

    .line 378
    :goto_d
    check-cast v3, Landroidx/compose/ui/layout/Measurable;

    .line 379
    .line 380
    if-eqz v3, :cond_e

    .line 381
    .line 382
    invoke-interface {v3, v12, v13}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    move-object v10, v2

    .line 387
    goto :goto_e

    .line 388
    :cond_e
    const/4 v10, 0x0

    .line 389
    :goto_e
    if-eqz v10, :cond_f

    .line 390
    .line 391
    iget-object v2, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->onLabelMeasured:Lv3/l;

    .line 392
    .line 393
    invoke-virtual {v10}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    int-to-float v3, v3

    .line 398
    invoke-virtual {v10}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    int-to-float v12, v12

    .line 403
    invoke-static {v3, v12}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    .line 404
    .line 405
    .line 406
    move-result-wide v12

    .line 407
    invoke-static {v12, v13}, Landroidx/compose/ui/geometry/Size;->box-impl(J)Landroidx/compose/ui/geometry/Size;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-interface {v2, v3}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    :cond_f
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    const/4 v3, 0x0

    .line 419
    :goto_f
    if-ge v3, v2, :cond_11

    .line 420
    .line 421
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v12

    .line 425
    move-object v13, v12

    .line 426
    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .line 427
    .line 428
    invoke-static {v13}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v13

    .line 432
    move/from16 v18, v2

    .line 433
    .line 434
    const-string v2, "Supporting"

    .line 435
    .line 436
    invoke-static {v13, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    if-eqz v2, :cond_10

    .line 441
    .line 442
    goto :goto_10

    .line 443
    :cond_10
    add-int/lit8 v3, v3, 0x1

    .line 444
    .line 445
    move/from16 v2, v18

    .line 446
    .line 447
    goto :goto_f

    .line 448
    :cond_11
    const/4 v12, 0x0

    .line 449
    :goto_10
    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    .line 450
    .line 451
    if-eqz v12, :cond_12

    .line 452
    .line 453
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    invoke-interface {v12, v2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    goto :goto_11

    .line 462
    :cond_12
    const/4 v2, 0x0

    .line 463
    :goto_11
    invoke-static {v10}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    div-int/lit8 v3, v3, 0x2

    .line 468
    .line 469
    iget-object v13, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 470
    .line 471
    invoke-interface {v13}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    .line 472
    .line 473
    .line 474
    move-result v13

    .line 475
    invoke-interface {v15, v13}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 476
    .line 477
    .line 478
    move-result v13

    .line 479
    invoke-static {v3, v13}, Ljava/lang/Math;->max(II)I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    sub-int/2addr v11, v3

    .line 484
    sub-int/2addr v11, v2

    .line 485
    move-object v2, v12

    .line 486
    move-wide/from16 v12, p3

    .line 487
    .line 488
    invoke-static {v12, v13, v6, v11}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    .line 489
    .line 490
    .line 491
    move-result-wide v23

    .line 492
    const/16 v25, 0x0

    .line 493
    .line 494
    const/16 v26, 0x0

    .line 495
    .line 496
    const/16 v27, 0x0

    .line 497
    .line 498
    const/16 v28, 0x0

    .line 499
    .line 500
    const/16 v29, 0xb

    .line 501
    .line 502
    const/16 v30, 0x0

    .line 503
    .line 504
    invoke-static/range {v23 .. v30}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 505
    .line 506
    .line 507
    move-result-wide v11

    .line 508
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 509
    .line 510
    .line 511
    move-result v6

    .line 512
    const/4 v13, 0x0

    .line 513
    :goto_12
    const-string v15, "Collection contains no element matching the predicate."

    .line 514
    .line 515
    if-ge v13, v6, :cond_1c

    .line 516
    .line 517
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v18

    .line 521
    move/from16 v19, v6

    .line 522
    .line 523
    move-object/from16 v6, v18

    .line 524
    .line 525
    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 526
    .line 527
    move/from16 v18, v13

    .line 528
    .line 529
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v13

    .line 533
    move-object/from16 v39, v15

    .line 534
    .line 535
    const-string v15, "TextField"

    .line 536
    .line 537
    invoke-static {v13, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v13

    .line 541
    if-eqz v13, :cond_1b

    .line 542
    .line 543
    invoke-interface {v6, v11, v12}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 544
    .line 545
    .line 546
    move-result-object v13

    .line 547
    const/16 v33, 0x0

    .line 548
    .line 549
    const/16 v34, 0x0

    .line 550
    .line 551
    const/16 v35, 0x0

    .line 552
    .line 553
    const/16 v36, 0x0

    .line 554
    .line 555
    const/16 v37, 0xe

    .line 556
    .line 557
    const/16 v38, 0x0

    .line 558
    .line 559
    move-wide/from16 v31, v11

    .line 560
    .line 561
    invoke-static/range {v31 .. v38}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 562
    .line 563
    .line 564
    move-result-wide v11

    .line 565
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 566
    .line 567
    .line 568
    move-result v6

    .line 569
    const/4 v15, 0x0

    .line 570
    :goto_13
    if-ge v15, v6, :cond_14

    .line 571
    .line 572
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v18

    .line 576
    move-object/from16 v19, v18

    .line 577
    .line 578
    check-cast v19, Landroidx/compose/ui/layout/Measurable;

    .line 579
    .line 580
    move/from16 v20, v6

    .line 581
    .line 582
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v6

    .line 586
    const-string v0, "Hint"

    .line 587
    .line 588
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    if-eqz v0, :cond_13

    .line 593
    .line 594
    goto :goto_14

    .line 595
    :cond_13
    add-int/lit8 v15, v15, 0x1

    .line 596
    .line 597
    move-object/from16 v0, p2

    .line 598
    .line 599
    move/from16 v6, v20

    .line 600
    .line 601
    goto :goto_13

    .line 602
    :cond_14
    const/16 v18, 0x0

    .line 603
    .line 604
    :goto_14
    move-object/from16 v0, v18

    .line 605
    .line 606
    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 607
    .line 608
    if-eqz v0, :cond_15

    .line 609
    .line 610
    invoke-interface {v0, v11, v12}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    move-object v11, v0

    .line 615
    goto :goto_15

    .line 616
    :cond_15
    const/4 v11, 0x0

    .line 617
    :goto_15
    invoke-static {v13}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 618
    .line 619
    .line 620
    move-result v0

    .line 621
    invoke-static {v11}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 622
    .line 623
    .line 624
    move-result v6

    .line 625
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    add-int/2addr v0, v3

    .line 630
    add-int/2addr v0, v1

    .line 631
    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    invoke-static {v4}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 636
    .line 637
    .line 638
    move-result v23

    .line 639
    invoke-static {v9}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 640
    .line 641
    .line 642
    move-result v24

    .line 643
    invoke-static {v5}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 644
    .line 645
    .line 646
    move-result v25

    .line 647
    invoke-static {v7}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 648
    .line 649
    .line 650
    move-result v26

    .line 651
    invoke-virtual {v13}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 652
    .line 653
    .line 654
    move-result v27

    .line 655
    invoke-static {v10}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 656
    .line 657
    .line 658
    move-result v28

    .line 659
    invoke-static {v11}, Landroidx/compose/material3/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 660
    .line 661
    .line 662
    move-result v29

    .line 663
    iget v1, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 664
    .line 665
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/unit/Density;->getDensity()F

    .line 666
    .line 667
    .line 668
    move-result v33

    .line 669
    iget-object v3, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 670
    .line 671
    move/from16 v30, v1

    .line 672
    .line 673
    move-wide/from16 v31, p3

    .line 674
    .line 675
    move-object/from16 v34, v3

    .line 676
    .line 677
    invoke-static/range {v23 .. v34}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$calculateWidth-DHJA7U0(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    .line 678
    .line 679
    .line 680
    move-result v15

    .line 681
    const/16 v18, 0x0

    .line 682
    .line 683
    neg-int v0, v0

    .line 684
    const/16 v20, 0x1

    .line 685
    .line 686
    const/16 v21, 0x0

    .line 687
    .line 688
    move/from16 v19, v0

    .line 689
    .line 690
    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    .line 691
    .line 692
    .line 693
    move-result-wide v40

    .line 694
    const/16 v42, 0x0

    .line 695
    .line 696
    const/16 v44, 0x0

    .line 697
    .line 698
    const/16 v45, 0x0

    .line 699
    .line 700
    const/16 v46, 0x9

    .line 701
    .line 702
    const/16 v47, 0x0

    .line 703
    .line 704
    move/from16 v43, v15

    .line 705
    .line 706
    invoke-static/range {v40 .. v47}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 707
    .line 708
    .line 709
    move-result-wide v0

    .line 710
    if-eqz v2, :cond_16

    .line 711
    .line 712
    invoke-interface {v2, v0, v1}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    move-object/from16 v22, v0

    .line 717
    .line 718
    goto :goto_16

    .line 719
    :cond_16
    const/16 v22, 0x0

    .line 720
    .line 721
    :goto_16
    invoke-static/range {v22 .. v22}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 722
    .line 723
    .line 724
    move-result v0

    .line 725
    invoke-static {v4}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 726
    .line 727
    .line 728
    move-result v23

    .line 729
    invoke-static {v9}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 730
    .line 731
    .line 732
    move-result v24

    .line 733
    invoke-static {v5}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 734
    .line 735
    .line 736
    move-result v25

    .line 737
    invoke-static {v7}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 738
    .line 739
    .line 740
    move-result v26

    .line 741
    invoke-virtual {v13}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 742
    .line 743
    .line 744
    move-result v27

    .line 745
    invoke-static {v10}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 746
    .line 747
    .line 748
    move-result v28

    .line 749
    invoke-static {v11}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 750
    .line 751
    .line 752
    move-result v29

    .line 753
    invoke-static/range {v22 .. v22}, Landroidx/compose/material3/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 754
    .line 755
    .line 756
    move-result v30

    .line 757
    iget v1, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->animationProgress:F

    .line 758
    .line 759
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/unit/Density;->getDensity()F

    .line 760
    .line 761
    .line 762
    move-result v34

    .line 763
    iget-object v2, v14, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 764
    .line 765
    move/from16 v31, v1

    .line 766
    .line 767
    move-wide/from16 v32, p3

    .line 768
    .line 769
    move-object/from16 v35, v2

    .line 770
    .line 771
    invoke-static/range {v23 .. v35}, Landroidx/compose/material3/OutlinedTextFieldKt;->access$calculateHeight-mKXJcVc(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    .line 772
    .line 773
    .line 774
    move-result v16

    .line 775
    sub-int v0, v16, v0

    .line 776
    .line 777
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 778
    .line 779
    .line 780
    move-result v1

    .line 781
    const/4 v2, 0x0

    .line 782
    :goto_17
    if-ge v2, v1, :cond_1a

    .line 783
    .line 784
    move-object/from16 v6, p2

    .line 785
    .line 786
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    check-cast v3, Landroidx/compose/ui/layout/Measurable;

    .line 791
    .line 792
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v8

    .line 796
    const-string v12, "Container"

    .line 797
    .line 798
    invoke-static {v8, v12}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v8

    .line 802
    if-eqz v8, :cond_19

    .line 803
    .line 804
    const v1, 0x7fffffff

    .line 805
    .line 806
    .line 807
    if-eq v15, v1, :cond_17

    .line 808
    .line 809
    move v2, v15

    .line 810
    goto :goto_18

    .line 811
    :cond_17
    const/4 v2, 0x0

    .line 812
    :goto_18
    if-eq v0, v1, :cond_18

    .line 813
    .line 814
    move v1, v0

    .line 815
    goto :goto_19

    .line 816
    :cond_18
    const/4 v1, 0x0

    .line 817
    :goto_19
    invoke-static {v2, v15, v1, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    .line 818
    .line 819
    .line 820
    move-result-wide v0

    .line 821
    invoke-interface {v3, v0, v1}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 822
    .line 823
    .line 824
    move-result-object v12

    .line 825
    const/16 v17, 0x0

    .line 826
    .line 827
    new-instance v18, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$measure$2;

    .line 828
    .line 829
    move-object/from16 v0, v18

    .line 830
    .line 831
    move/from16 v1, v16

    .line 832
    .line 833
    move v2, v15

    .line 834
    move-object v3, v4

    .line 835
    move-object v4, v9

    .line 836
    move-object v6, v7

    .line 837
    move-object v7, v13

    .line 838
    move-object v8, v10

    .line 839
    move-object v9, v11

    .line 840
    move-object v10, v12

    .line 841
    move-object/from16 v11, v22

    .line 842
    .line 843
    move-object/from16 v12, p0

    .line 844
    .line 845
    move-object/from16 v13, p1

    .line 846
    .line 847
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$measure$2;-><init>(IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;Landroidx/compose/ui/layout/MeasureScope;)V

    .line 848
    .line 849
    .line 850
    const/4 v5, 0x4

    .line 851
    const/4 v6, 0x0

    .line 852
    move-object/from16 v0, p1

    .line 853
    .line 854
    move v1, v15

    .line 855
    move/from16 v2, v16

    .line 856
    .line 857
    move-object/from16 v3, v17

    .line 858
    .line 859
    move-object/from16 v4, v18

    .line 860
    .line 861
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    return-object v0

    .line 866
    :cond_19
    add-int/lit8 v2, v2, 0x1

    .line 867
    .line 868
    goto :goto_17

    .line 869
    :cond_1a
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 870
    .line 871
    move-object/from16 v13, v39

    .line 872
    .line 873
    invoke-direct {v0, v13}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    throw v0

    .line 877
    :cond_1b
    move-object v6, v0

    .line 878
    add-int/lit8 v13, v18, 0x1

    .line 879
    .line 880
    move/from16 v6, v19

    .line 881
    .line 882
    goto/16 :goto_12

    .line 883
    .line 884
    :cond_1c
    move-object v13, v15

    .line 885
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 886
    .line 887
    invoke-direct {v0, v13}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    throw v0
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    sget-object v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->intrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILv3/p;)I

    move-result p1

    return p1
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    sget-object v0, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;->intrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILv3/p;)I

    move-result p1

    return p1
.end method
