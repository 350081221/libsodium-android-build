.class Lcom/bytedance/mtesttools/d/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/mtesttools/d/c;
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

.field public f:Landroid/widget/TextView;

.field final synthetic g:Lcom/bytedance/mtesttools/d/c;


# direct methods
.method constructor <init>(Lcom/bytedance/mtesttools/d/c;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->g:Lcom/bytedance/mtesttools/d/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILj1/d;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lj1/d;->e()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-lez p1, :cond_4

    .line 6
    .line 7
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->b:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {p2}, Lj1/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->c:Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-virtual {p2}, Lj1/d;->d()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lj1/d;->c()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lk1/f;->e(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {p2}, Lj1/d;->c()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lk1/f;->k(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/c$a;->d:Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/c$a;->d:Landroid/widget/TextView;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/c$a;->d:Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual {p2}, Lj1/d;->c()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lk1/f;->m(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/c$a;->e:Landroid/widget/TextView;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/c$a;->e:Landroid/widget/TextView;

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/c$a;->e:Landroid/widget/TextView;

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 85
    .line 86
    .line 87
    :goto_1
    if-eqz p1, :cond_2

    .line 88
    .line 89
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->f:Landroid/widget/TextView;

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->f:Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->f:Landroid/widget/TextView;

    .line 100
    .line 101
    const-string/jumbo v0, "\u4e0d\u652f\u6301\u68c0\u6d4b"

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->g:Lcom/bytedance/mtesttools/d/c;

    .line 109
    .line 110
    invoke-static {p1}, Lcom/bytedance/mtesttools/d/c;->a(Lcom/bytedance/mtesttools/d/c;)Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p2}, Lj1/d;->c()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {p1, v0}, Lk1/f;->c(Landroid/content/Context;Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    iget-object v0, p0, Lcom/bytedance/mtesttools/d/c$a;->f:Landroid/widget/TextView;

    .line 123
    .line 124
    const-string v3, "Manifest"

    .line 125
    .line 126
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    if-eqz p1, :cond_3

    .line 130
    .line 131
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->f:Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->f:Landroid/widget/TextView;

    .line 137
    .line 138
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->f:Landroid/widget/TextView;

    .line 143
    .line 144
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 145
    .line 146
    .line 147
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/bytedance/mtesttools/d/c$a;->a:Landroid/widget/RelativeLayout;

    .line 148
    .line 149
    new-instance v0, Lcom/bytedance/mtesttools/d/c$a$a;

    .line 150
    .line 151
    invoke-direct {v0, p0, p2}, Lcom/bytedance/mtesttools/d/c$a$a;-><init>(Lcom/bytedance/mtesttools/d/c$a;Lj1/d;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    .line 156
    .line 157
    return-void
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
