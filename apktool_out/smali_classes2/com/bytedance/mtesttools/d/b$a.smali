.class Lcom/bytedance/mtesttools/d/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/d/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/widget/RelativeLayout;

.field public b:Landroid/widget/ImageView;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field final synthetic f:Lcom/bytedance/mtesttools/d/b;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/d/b;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->f:Lcom/bytedance/mtesttools/d/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILj1/f;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lj1/f;->f()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->b:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {p2}, Lj1/f;->f()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->c:Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-virtual {p2}, Lj1/f;->i()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lj1/f;->j()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v0, 0x0

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->d:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->d:Landroid/widget/TextView;

    .line 39
    .line 40
    const/16 v1, 0x8

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {p2}, Lj1/f;->a()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const/4 v1, 0x1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->e:Landroid/widget/TextView;

    .line 53
    .line 54
    const-string/jumbo v0, "\u672a\u6d4b\u8bd5"

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->e:Landroid/widget/TextView;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->e:Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {p2}, Lj1/f;->a()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-ne p1, v1, :cond_3

    .line 76
    .line 77
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->e:Landroid/widget/TextView;

    .line 78
    .line 79
    const-string/jumbo v2, "\u6d4b\u8bd5\u5b8c\u6210"

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->e:Landroid/widget/TextView;

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->e:Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->e:Landroid/widget/TextView;

    .line 97
    .line 98
    const-string/jumbo v1, "\u6d4b\u8bd5\u5931\u8d25"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->e:Landroid/widget/TextView;

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 107
    .line 108
    .line 109
    :goto_1
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/b$a;->a:Landroid/widget/RelativeLayout;

    .line 110
    .line 111
    new-instance v0, Lcom/bytedance/mtesttools/d/b$a$a;

    .line 112
    .line 113
    invoke-direct {v0, p0, p2}, Lcom/bytedance/mtesttools/d/b$a$a;-><init>(Lcom/bytedance/mtesttools/d/b$a;Lj1/f;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    .line 118
    .line 119
    return-void
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
