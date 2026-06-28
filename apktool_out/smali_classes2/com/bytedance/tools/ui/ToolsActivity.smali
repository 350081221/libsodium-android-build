.class public Lcom/bytedance/tools/ui/ToolsActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/LinearLayout;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/tools/ui/ToolsActivity;->a:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/tools/ui/ToolsActivity;->b:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/bytedance/tools/ui/ToolsActivity;->c:Ljava/util/List;

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

.method private C(I)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "test_tool_basic_info"

    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v1, "test_tool_slot_info"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v1, "test_tool_overall_info"

    .line 16
    .line 17
    :cond_2
    :goto_0
    invoke-static {p0, v1}, Lcom/bytedance/tools/d/j;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_1
    iget-object v3, p0, Lcom/bytedance/tools/ui/ToolsActivity;->b:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ge v2, v3, :cond_4

    .line 29
    .line 30
    if-ne p1, v2, :cond_3

    .line 31
    .line 32
    iget-object v3, p0, Lcom/bytedance/tools/ui/ToolsActivity;->b:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Landroid/widget/TextView;

    .line 39
    .line 40
    const-string v4, "#161823"

    .line 41
    .line 42
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    .line 48
    .line 49
    iget-object v3, p0, Lcom/bytedance/tools/ui/ToolsActivity;->c:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Landroid/view/View;

    .line 56
    .line 57
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, Lcom/bytedance/tools/ui/ToolsActivity;->b:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Landroid/widget/TextView;

    .line 71
    .line 72
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    iget-object v3, p0, Lcom/bytedance/tools/ui/ToolsActivity;->b:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Landroid/widget/TextView;

    .line 87
    .line 88
    const-string v4, "#80161823"

    .line 89
    .line 90
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Lcom/bytedance/tools/ui/ToolsActivity;->c:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Landroid/view/View;

    .line 104
    .line 105
    const-string v4, "#ffffff"

    .line 106
    .line 107
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 112
    .line 113
    .line 114
    iget-object v3, p0, Lcom/bytedance/tools/ui/ToolsActivity;->b:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Landroid/widget/TextView;

    .line 121
    .line 122
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 127
    .line 128
    .line 129
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    return-void
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

.method static synthetic D(Lcom/bytedance/tools/ui/ToolsActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/bytedance/tools/ui/ToolsActivity;->C(I)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    sget p1, Lcom/bytedance/tools/R$layout;->F:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/bytedance/tools/d/d;->d(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v0, 0x0

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    const-string/jumbo p1, "\u7a7f\u5c71\u7532SDK\u6216\u4e0d\u5b58\u5728\uff0c\u65e0\u6cd5\u4f7f\u7528\u6d4b\u8bd5\u5de5\u5177"

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const-string p1, "test_tool_start"

    .line 45
    .line 46
    invoke-static {p0, p1}, Lcom/bytedance/tools/d/j;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->a:Ljava/util/List;

    .line 50
    .line 51
    sget v1, Lcom/bytedance/tools/R$id;->a0:I

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->a:Ljava/util/List;

    .line 61
    .line 62
    sget v1, Lcom/bytedance/tools/R$id;->X0:I

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->a:Ljava/util/List;

    .line 72
    .line 73
    sget v1, Lcom/bytedance/tools/R$id;->c3:I

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->b:Ljava/util/List;

    .line 83
    .line 84
    sget v1, Lcom/bytedance/tools/R$id;->c0:I

    .line 85
    .line 86
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->b:Ljava/util/List;

    .line 94
    .line 95
    sget v1, Lcom/bytedance/tools/R$id;->Z0:I

    .line 96
    .line 97
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->b:Ljava/util/List;

    .line 105
    .line 106
    sget v1, Lcom/bytedance/tools/R$id;->e3:I

    .line 107
    .line 108
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->c:Ljava/util/List;

    .line 116
    .line 117
    sget v1, Lcom/bytedance/tools/R$id;->b0:I

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->c:Ljava/util/List;

    .line 127
    .line 128
    sget v1, Lcom/bytedance/tools/R$id;->Y0:I

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->c:Ljava/util/List;

    .line 138
    .line 139
    sget v1, Lcom/bytedance/tools/R$id;->d3:I

    .line 140
    .line 141
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    invoke-direct {p0, v0}, Lcom/bytedance/tools/ui/ToolsActivity;->C(I)V

    .line 149
    .line 150
    .line 151
    sget p1, Lcom/bytedance/tools/R$id;->f4:I

    .line 152
    .line 153
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 158
    .line 159
    const-string/jumbo v1, "\u7a7f\u5c71\u7532SDK\u6d4b\u8bd5\u5de5\u5177"

    .line 160
    .line 161
    .line 162
    invoke-static {p0, p1, v1}, Lcom/bytedance/tools/d/i;->a(Landroidx/appcompat/app/AppCompatActivity;Landroidx/appcompat/widget/Toolbar;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    new-instance p1, Lcom/bytedance/tools/ui/ui/main/a;

    .line 166
    .line 167
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-direct {p1, p0, v1}, Lcom/bytedance/tools/ui/ui/main/a;-><init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V

    .line 172
    .line 173
    .line 174
    sget v1, Lcom/bytedance/tools/R$id;->R4:I

    .line 175
    .line 176
    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Landroidx/viewpager/widget/ViewPager;

    .line 181
    .line 182
    invoke-virtual {v1, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 183
    .line 184
    .line 185
    new-instance p1, Lcom/bytedance/tools/ui/ToolsActivity$a;

    .line 186
    .line 187
    invoke-direct {p1, p0}, Lcom/bytedance/tools/ui/ToolsActivity$a;-><init>(Lcom/bytedance/tools/ui/ToolsActivity;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, p1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 191
    .line 192
    .line 193
    :goto_0
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->a:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-ge v0, p1, :cond_1

    .line 200
    .line 201
    iget-object p1, p0, Lcom/bytedance/tools/ui/ToolsActivity;->a:Ljava/util/List;

    .line 202
    .line 203
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    check-cast p1, Landroid/widget/LinearLayout;

    .line 208
    .line 209
    new-instance v2, Lcom/bytedance/tools/ui/ToolsActivity$b;

    .line 210
    .line 211
    invoke-direct {v2, p0, v1, v0}, Lcom/bytedance/tools/ui/ToolsActivity$b;-><init>(Lcom/bytedance/tools/ui/ToolsActivity;Landroidx/viewpager/widget/ViewPager;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 215
    .line 216
    .line 217
    add-int/lit8 v0, v0, 0x1

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 221
    .line 222
    .line 223
    return-void
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

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    const-string v0, "test_tool_close"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lcom/bytedance/tools/d/j;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method protected onRestart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
