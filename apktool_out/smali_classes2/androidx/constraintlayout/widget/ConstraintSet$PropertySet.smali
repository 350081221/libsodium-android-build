.class public Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/ConstraintSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PropertySet"
.end annotation


# instance fields
.field public alpha:F

.field public mApply:Z

.field public mProgress:F

.field public mVisibilityMode:I

.field public visibility:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mApply:Z

    .line 6
    .line 7
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->visibility:I

    .line 8
    .line 9
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mVisibilityMode:I

    .line 10
    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->alpha:F

    .line 14
    .line 15
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 16
    .line 17
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mProgress:F

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method


# virtual methods
.method public copyFrom(Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mApply:Z

    .line 2
    .line 3
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mApply:Z

    .line 4
    .line 5
    iget v0, p1, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->visibility:I

    .line 6
    .line 7
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->visibility:I

    .line 8
    .line 9
    iget v0, p1, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->alpha:F

    .line 10
    .line 11
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->alpha:F

    .line 12
    .line 13
    iget v0, p1, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mProgress:F

    .line 14
    .line 15
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mProgress:F

    .line 16
    .line 17
    iget p1, p1, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mVisibilityMode:I

    .line 18
    .line 19
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mVisibilityMode:I

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method fillFromAttributeList(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/constraintlayout/widget/R$styleable;->PropertySet:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x1

    .line 8
    iput-boolean p2, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mApply:Z

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-ge v0, p2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->PropertySet_android_alpha:I

    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    iget v2, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->alpha:F

    .line 26
    .line 27
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->alpha:F

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->PropertySet_android_visibility:I

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    iget v2, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->visibility:I

    .line 39
    .line 40
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->visibility:I

    .line 45
    .line 46
    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintSet;->access$200()[I

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget v2, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->visibility:I

    .line 51
    .line 52
    aget v1, v1, v2

    .line 53
    .line 54
    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->visibility:I

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->PropertySet_visibilityMode:I

    .line 58
    .line 59
    if-ne v1, v2, :cond_2

    .line 60
    .line 61
    iget v2, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mVisibilityMode:I

    .line 62
    .line 63
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mVisibilityMode:I

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    sget v2, Landroidx/constraintlayout/widget/R$styleable;->PropertySet_motionProgress:I

    .line 71
    .line 72
    if-ne v1, v2, :cond_3

    .line 73
    .line 74
    iget v2, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mProgress:F

    .line 75
    .line 76
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintSet$PropertySet;->mProgress:F

    .line 81
    .line 82
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 86
    .line 87
    .line 88
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
.end method
