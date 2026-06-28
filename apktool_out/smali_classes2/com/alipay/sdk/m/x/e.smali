.class public Lcom/alipay/sdk/m/x/e;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alipay/sdk/m/x/e$h;,
        Lcom/alipay/sdk/m/x/e$g;,
        Lcom/alipay/sdk/m/x/e$f;,
        Lcom/alipay/sdk/m/x/e$e;
    }
.end annotation


# static fields
.field public static m:Landroid/os/Handler;


# instance fields
.field public a:Landroid/widget/ImageView;

.field public b:Landroid/widget/TextView;

.field public c:Landroid/widget/ImageView;

.field public d:Landroid/widget/ProgressBar;

.field public e:Landroid/webkit/WebView;

.field public final f:Lcom/alipay/sdk/m/x/e$e;

.field public g:Lcom/alipay/sdk/m/x/e$f;

.field public h:Lcom/alipay/sdk/m/x/e$g;

.field public i:Lcom/alipay/sdk/m/x/e$h;

.field public final j:Ly0/a;

.field public k:Landroid/view/View$OnClickListener;

.field public final l:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/alipay/sdk/m/x/e;->m:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Ly0/a;Lcom/alipay/sdk/m/x/e$e;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance p2, Lcom/alipay/sdk/m/x/e$a;

    invoke-direct {p2, p0}, Lcom/alipay/sdk/m/x/e$a;-><init>(Lcom/alipay/sdk/m/x/e;)V

    iput-object p2, p0, Lcom/alipay/sdk/m/x/e;->k:Landroid/view/View$OnClickListener;

    if-nez p4, :cond_0

    .line 4
    new-instance p4, Lcom/alipay/sdk/m/x/e$e;

    const/4 p2, 0x0

    invoke-direct {p4, p2, p2}, Lcom/alipay/sdk/m/x/e$e;-><init>(ZZ)V

    .line 5
    :cond_0
    iput-object p4, p0, Lcom/alipay/sdk/m/x/e;->f:Lcom/alipay/sdk/m/x/e$e;

    .line 6
    iput-object p3, p0, Lcom/alipay/sdk/m/x/e;->j:Ly0/a;

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, Lcom/alipay/sdk/m/x/e;->l:F

    const/4 p2, 0x1

    .line 8
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 9
    invoke-direct {p0, p1}, Lcom/alipay/sdk/m/x/e;->d(Landroid/content/Context;)V

    .line 10
    invoke-direct {p0, p1}, Lcom/alipay/sdk/m/x/e;->j(Landroid/content/Context;)V

    .line 11
    invoke-direct {p0, p1}, Lcom/alipay/sdk/m/x/e;->l(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly0/a;Lcom/alipay/sdk/m/x/e$e;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, p2, p3}, Lcom/alipay/sdk/m/x/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Ly0/a;Lcom/alipay/sdk/m/x/e$e;)V

    return-void
.end method

.method private a(I)I
    .locals 1

    int-to-float p1, p1

    iget v0, p0, Lcom/alipay/sdk/m/x/e;->l:F

    mul-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public static synthetic b(Lcom/alipay/sdk/m/x/e;)Lcom/alipay/sdk/m/x/e$h;
    .locals 0

    iget-object p0, p0, Lcom/alipay/sdk/m/x/e;->i:Lcom/alipay/sdk/m/x/e$h;

    return-object p0
.end method

.method private d(Landroid/content/Context;)V
    .locals 9

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const v1, -0xd000001

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x10

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->f:Lcom/alipay/sdk/m/x/e$e;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/alipay/sdk/m/x/e$e;->a(Lcom/alipay/sdk/m/x/e$e;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move v2, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/16 v2, 0x8

    .line 32
    .line 33
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Landroid/widget/ImageView;

    .line 37
    .line 38
    invoke-direct {v2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lcom/alipay/sdk/m/x/e;->a:Landroid/widget/ImageView;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/alipay/sdk/m/x/e;->k:Landroid/view/View$OnClickListener;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->a:Landroid/widget/ImageView;

    .line 49
    .line 50
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->a:Landroid/widget/ImageView;

    .line 56
    .line 57
    const-string v3, "iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAFVBMVEUAAAARjusRkOkQjuoRkeoRj+oQjunya570AAAABnRSTlMAinWeSkk7CjRNAAAAZElEQVRIx+3MOw6AIBQF0YsrMDGx1obaLeGH/S9BQgkJ82rypp4ceTN1ilvyKizmZIAyU7FML0JVYig55BBAfQ2EU4V4CpZJ+2AiSj11C6rUoTannBpRn4W6xNQjLBSI2+TN0w/+3HT2wPClrQAAAABJRU5ErkJggg=="

    .line 58
    .line 59
    invoke-static {v3, p1}, La1/k;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->a:Landroid/widget/ImageView;

    .line 67
    .line 68
    const/16 v3, 0xc

    .line 69
    .line 70
    invoke-direct {p0, v3}, Lcom/alipay/sdk/m/x/e;->a(I)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-direct {p0, v3}, Lcom/alipay/sdk/m/x/e;->a(I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-virtual {v2, v4, v1, v5, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 79
    .line 80
    .line 81
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 82
    .line 83
    const/4 v4, -0x2

    .line 84
    invoke-direct {v2, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 85
    .line 86
    .line 87
    iget-object v5, p0, Lcom/alipay/sdk/m/x/e;->a:Landroid/widget/ImageView;

    .line 88
    .line 89
    invoke-virtual {v0, v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    new-instance v2, Landroid/view/View;

    .line 93
    .line 94
    invoke-direct {v2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    const v5, -0x262627

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 101
    .line 102
    .line 103
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 104
    .line 105
    const/4 v6, 0x1

    .line 106
    invoke-direct {p0, v6}, Lcom/alipay/sdk/m/x/e;->a(I)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    const/16 v8, 0x19

    .line 111
    .line 112
    invoke-direct {p0, v8}, Lcom/alipay/sdk/m/x/e;->a(I)I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    invoke-direct {v5, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 120
    .line 121
    .line 122
    new-instance v2, Landroid/widget/TextView;

    .line 123
    .line 124
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    iput-object v2, p0, Lcom/alipay/sdk/m/x/e;->b:Landroid/widget/TextView;

    .line 128
    .line 129
    const v5, -0xeeeeef

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 133
    .line 134
    .line 135
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->b:Landroid/widget/TextView;

    .line 136
    .line 137
    const/high16 v5, 0x41880000    # 17.0f

    .line 138
    .line 139
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 140
    .line 141
    .line 142
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->b:Landroid/widget/TextView;

    .line 143
    .line 144
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 145
    .line 146
    .line 147
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->b:Landroid/widget/TextView;

    .line 148
    .line 149
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 150
    .line 151
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 152
    .line 153
    .line 154
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 155
    .line 156
    const/4 v5, -0x1

    .line 157
    invoke-direct {v2, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 158
    .line 159
    .line 160
    const/16 v6, 0x11

    .line 161
    .line 162
    invoke-direct {p0, v6}, Lcom/alipay/sdk/m/x/e;->a(I)I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    invoke-virtual {v2, v6, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 167
    .line 168
    .line 169
    const/high16 v6, 0x3f800000    # 1.0f

    .line 170
    .line 171
    iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 172
    .line 173
    iget-object v6, p0, Lcom/alipay/sdk/m/x/e;->b:Landroid/widget/TextView;

    .line 174
    .line 175
    invoke-virtual {v0, v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 176
    .line 177
    .line 178
    new-instance v2, Landroid/widget/ImageView;

    .line 179
    .line 180
    invoke-direct {v2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 181
    .line 182
    .line 183
    iput-object v2, p0, Lcom/alipay/sdk/m/x/e;->c:Landroid/widget/ImageView;

    .line 184
    .line 185
    iget-object v6, p0, Lcom/alipay/sdk/m/x/e;->k:Landroid/view/View$OnClickListener;

    .line 186
    .line 187
    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 188
    .line 189
    .line 190
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->c:Landroid/widget/ImageView;

    .line 191
    .line 192
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 193
    .line 194
    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 195
    .line 196
    .line 197
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->c:Landroid/widget/ImageView;

    .line 198
    .line 199
    const-string v6, "iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAMAAABiM0N1AAAAmVBMVEUAAAARj+oQjuoRkOsVk/AQj+oRjuoQj+oSkO3///8Rj+kRj+oQkOsTk+whm/8Qj+oRj+oQj+oSkus2p/8QjuoQj+oQj+oQj+oQj+oRj+oTkuwRj+oQj+oRj+oRj+oSkOsSkO0ZlfMbk+8XnPgQj+oRj+oQj+oQj+sSj+sRkOoSkescqv8Rj+oQj+oSj+sXku4Rj+kQjuoQjumXGBCVAAAAMnRSTlMAxPtPF8ry7CoB9npbGwe6lm0wBODazb1+aSejm5GEYjcTDwvls6uJc0g/CdWfRCF20AXrk5QAAAJqSURBVFjD7ZfXmpswEIUFphmDCxi3talurGvm/R8uYSDe5FNBwlzsxf6XmvFBmiaZ/PCdWDk9CWn61OhHCMAaXfoRAth7wx6EkMXnWyrho4yg4bDpquI8Jy78Q7eoj9cmUFijsaLM0JsD9CD0uQAa9aNdPuCFvbA7B9t/Becap8Pu6Q/2jcyH81VHc/WCHDQZXwbvtUhQ61iDlqadncU6Rp31yGkZIzOAu7AjtPpYGREzq/pY5DRFHS1siyO6HfkOKTrMjdb2qevV4zosK7MbkFY2LmYk55hL6juCIFWMOI2KGzblmho3b18EIbxL1hs6r5m2Q2WaEElwS3NW4xh6ZZJuzTtUsBKT4G0h35s4y1mNgkNoS6TZ8SKBXTZQGBNYdPTozXGYKoyLAmOasttjThT4xT6Ch+2qIjRhV9Ja3NC87Kyo5We1vCNEMW1T+j1VLZ9UhE54Q1DL52r5piJ0YxdegvWlHOwTu76uKkJX+MOTHno4YFSEbHYdhViojsLrCTg/MKnhKWaEYzvkZFM8aOkPH7iTSvoFZKD7jGEJbarkRaxQyOeWvGVIbsji152jK7TbDgRzcIuz7SGj89BFU8d30TqWeDtrILxyTkD1IXfvmHseuU3lVHDz607bw0f3xDqejm5ncd0j8VDwfoibRy8RcgTkWHBvocbDbMlJsQAkGnAOHwGy90kLmQY1Wkob07/GaCNRIzdoWK7/+6y/XkLDJCcynOGFuUrKIMuCMonNr9VpSOQoIxBgJ0SacGbzZNy4ICrkscvU2fpElYz+U3sd+aQThjfVmjNa5i15kLcojM3Gz8kP34jf4VaV3X55gNEAAAAASUVORK5CYII="

    .line 200
    .line 201
    invoke-static {v6, p1}, La1/k;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->c:Landroid/widget/ImageView;

    .line 209
    .line 210
    invoke-direct {p0, v3}, Lcom/alipay/sdk/m/x/e;->a(I)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-direct {p0, v3}, Lcom/alipay/sdk/m/x/e;->a(I)I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    invoke-virtual {p1, v2, v1, v3, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 219
    .line 220
    .line 221
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 222
    .line 223
    invoke-direct {p1, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 224
    .line 225
    .line 226
    iget-object v1, p0, Lcom/alipay/sdk/m/x/e;->c:Landroid/widget/ImageView;

    .line 227
    .line 228
    invoke-virtual {v0, v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 229
    .line 230
    .line 231
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 232
    .line 233
    const/16 v1, 0x30

    .line 234
    .line 235
    invoke-direct {p0, v1}, Lcom/alipay/sdk/m/x/e;->a(I)I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    invoke-direct {p1, v5, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 243
    .line 244
    .line 245
    return-void
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
.end method

.method public static synthetic h()Landroid/os/Handler;
    .locals 1

    sget-object v0, Lcom/alipay/sdk/m/x/e;->m:Landroid/os/Handler;

    return-object v0
.end method

.method public static synthetic i(Lcom/alipay/sdk/m/x/e;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/alipay/sdk/m/x/e;->a:Landroid/widget/ImageView;

    return-object p0
.end method

.method private j(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/ProgressBar;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x103001f

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p1, v1, v2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/alipay/sdk/m/x/e;->d:Landroid/widget/ProgressBar;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const v1, 0x108006c

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->d:Landroid/widget/ProgressBar;

    .line 27
    .line 28
    const/16 v0, 0x64

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->d:Landroid/widget/ProgressBar;

    .line 34
    .line 35
    const v0, -0xd000001

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    invoke-direct {p0, v0}, Lcom/alipay/sdk/m/x/e;->a(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v1, -0x1

    .line 49
    invoke-direct {p1, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->d:Landroid/widget/ProgressBar;

    .line 53
    .line 54
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    .line 56
    .line 57
    return-void
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
.end method

.method public static synthetic k(Lcom/alipay/sdk/m/x/e;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/alipay/sdk/m/x/e;->c:Landroid/widget/ImageView;

    return-object p0
.end method

.method private l(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "accessibilityTraversal"

    .line 2
    .line 3
    const-string v1, "accessibility"

    .line 4
    .line 5
    const-string v2, "searchBoxJavaBridge_"

    .line 6
    .line 7
    new-instance v3, Landroid/webkit/WebView;

    .line 8
    .line 9
    invoke-direct {v3, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v3, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setVerticalScrollbarOverlay(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 19
    .line 20
    invoke-virtual {p0, v3, p1}, Lcom/alipay/sdk/m/x/e;->e(Landroid/webkit/WebView;Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v5, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;

    .line 30
    .line 31
    invoke-virtual {v3, v5}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 38
    .line 39
    .line 40
    const-wide/32 v5, 0x500000

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v5, v6}, Landroid/webkit/WebSettings;->setAppCacheMaxSize(J)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v3, v5}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-virtual {v3, v5}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 59
    .line 60
    .line 61
    sget-object v6, Landroid/webkit/WebSettings$TextSize;->NORMAL:Landroid/webkit/WebSettings$TextSize;

    .line 62
    .line 63
    invoke-virtual {v3, v6}, Landroid/webkit/WebSettings;->setTextSize(Landroid/webkit/WebSettings$TextSize;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v5}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v5}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v5}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v5}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 91
    .line 92
    .line 93
    iget-object v3, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 94
    .line 95
    invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setVerticalScrollbarOverlay(Z)V

    .line 96
    .line 97
    .line 98
    iget-object v3, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 99
    .line 100
    new-instance v6, Lcom/alipay/sdk/m/x/e$b;

    .line 101
    .line 102
    invoke-direct {v6, p0, p1}, Lcom/alipay/sdk/m/x/e$b;-><init>(Lcom/alipay/sdk/m/x/e;Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v6}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 106
    .line 107
    .line 108
    :try_start_0
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 109
    .line 110
    invoke-virtual {p1, v2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 114
    .line 115
    invoke-virtual {p1, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :catch_0
    :try_start_1
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    const-string v3, "removeJavascriptInterface"

    .line 131
    .line 132
    :try_start_2
    new-array v6, v5, [Ljava/lang/Class;

    .line 133
    .line 134
    invoke-virtual {p1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-eqz p1, :cond_0

    .line 139
    .line 140
    iget-object v3, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 141
    .line 142
    new-array v6, v4, [Ljava/lang/Object;

    .line 143
    .line 144
    aput-object v2, v6, v5

    .line 145
    .line 146
    invoke-virtual {p1, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    iget-object v2, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 150
    .line 151
    new-array v3, v4, [Ljava/lang/Object;

    .line 152
    .line 153
    aput-object v1, v3, v5

    .line 154
    .line 155
    invoke-virtual {p1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    iget-object v1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 159
    .line 160
    new-array v2, v4, [Ljava/lang/Object;

    .line 161
    .line 162
    aput-object v0, v2, v5

    .line 163
    .line 164
    invoke-virtual {p1, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    .line 166
    .line 167
    :catchall_0
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 168
    .line 169
    invoke-static {p1}, Lcom/alipay/sdk/m/x/c;->j(Landroid/webkit/WebView;)V

    .line 170
    .line 171
    .line 172
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 173
    .line 174
    const/4 v0, -0x1

    .line 175
    invoke-direct {p1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 179
    .line 180
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    .line 182
    .line 183
    return-void
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
.end method

.method public static synthetic m(Lcom/alipay/sdk/m/x/e;)Lcom/alipay/sdk/m/x/e$e;
    .locals 0

    iget-object p0, p0, Lcom/alipay/sdk/m/x/e;->f:Lcom/alipay/sdk/m/x/e$e;

    return-object p0
.end method

.method public static synthetic n(Lcom/alipay/sdk/m/x/e;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/alipay/sdk/m/x/e;->d:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static synthetic o(Lcom/alipay/sdk/m/x/e;)Lcom/alipay/sdk/m/x/e$f;
    .locals 0

    iget-object p0, p0, Lcom/alipay/sdk/m/x/e;->g:Lcom/alipay/sdk/m/x/e$f;

    return-object p0
.end method

.method public static synthetic p(Lcom/alipay/sdk/m/x/e;)Lcom/alipay/sdk/m/x/e$g;
    .locals 0

    iget-object p0, p0, Lcom/alipay/sdk/m/x/e;->h:Lcom/alipay/sdk/m/x/e$g;

    return-object p0
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 23
    .line 24
    .line 25
    return-void
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
.end method

.method public e(Landroid/webkit/WebView;Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, La1/n;->a0(Landroid/content/Context;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
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
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/alipay/sdk/m/x/c;->j(Landroid/webkit/WebView;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public g(Ljava/lang/String;[B)V
    .locals 1

    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->postUrl(Ljava/lang/String;[B)V

    return-void
.end method

.method public getBackButton()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getProgressbar()Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->d:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public getRefreshButton()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->c:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWebView()Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    return-object v0
.end method

.method public setChromeProxy(Lcom/alipay/sdk/m/x/e$f;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/alipay/sdk/m/x/e;->g:Lcom/alipay/sdk/m/x/e$f;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 13
    .line 14
    new-instance v0, Lcom/alipay/sdk/m/x/e$c;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/alipay/sdk/m/x/e$c;-><init>(Lcom/alipay/sdk/m/x/e;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
    .line 23
    .line 24
.end method

.method public setWebClientProxy(Lcom/alipay/sdk/m/x/e$g;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/alipay/sdk/m/x/e;->h:Lcom/alipay/sdk/m/x/e$g;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e;->e:Landroid/webkit/WebView;

    .line 13
    .line 14
    new-instance v0, Lcom/alipay/sdk/m/x/e$d;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/alipay/sdk/m/x/e$d;-><init>(Lcom/alipay/sdk/m/x/e;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
    .line 23
    .line 24
.end method

.method public setWebEventProxy(Lcom/alipay/sdk/m/x/e$h;)V
    .locals 0

    iput-object p1, p0, Lcom/alipay/sdk/m/x/e;->i:Lcom/alipay/sdk/m/x/e$h;

    return-void
.end method
