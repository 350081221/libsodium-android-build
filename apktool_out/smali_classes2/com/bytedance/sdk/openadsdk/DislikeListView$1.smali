.class Lcom/bytedance/sdk/openadsdk/DislikeListView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/DislikeListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/DislikeListView;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/DislikeListView;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/DislikeListView$1;->a:Lcom/bytedance/sdk/openadsdk/DislikeListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/DislikeListView$1;->a:Lcom/bytedance/sdk/openadsdk/DislikeListView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/DislikeListView$1;->a:Lcom/bytedance/sdk/openadsdk/DislikeListView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/DislikeListView$1;->a:Lcom/bytedance/sdk/openadsdk/DislikeListView;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v0, v0, Lcom/bytedance/sdk/openadsdk/FilterWord;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/DislikeListView$1;->a:Lcom/bytedance/sdk/openadsdk/DislikeListView;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/bytedance/sdk/openadsdk/FilterWord;

    .line 46
    .line 47
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/FilterWord;->hasSecondOptions()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/DislikeListView$1;->a:Lcom/bytedance/sdk/openadsdk/DislikeListView;

    .line 54
    .line 55
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/DislikeListView;->access$000(Lcom/bytedance/sdk/openadsdk/DislikeListView;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/DislikeListView$1;->a:Lcom/bytedance/sdk/openadsdk/DislikeListView;

    .line 62
    .line 63
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/DislikeListView;->access$000(Lcom/bytedance/sdk/openadsdk/DislikeListView;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    move-object v3, p1

    .line 68
    move-object v4, p2

    .line 69
    move v5, p3

    .line 70
    move-wide v6, p4

    .line 71
    invoke-interface/range {v2 .. v7}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 72
    .line 73
    .line 74
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/DislikeListView$1;->a:Lcom/bytedance/sdk/openadsdk/DislikeListView;

    .line 75
    .line 76
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/DislikeListView;->access$100(Lcom/bytedance/sdk/openadsdk/DislikeListView;)Lcom/bykv/vk/openvk/api/proto/EventListener;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/FilterWord;->getId()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const/4 p3, 0x0

    .line 91
    invoke-virtual {p1, p3, p2}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/4 p2, 0x1

    .line 96
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/FilterWord;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    invoke-virtual {p1, p2, p4}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/DislikeListView$1;->a:Lcom/bytedance/sdk/openadsdk/DislikeListView;

    .line 109
    .line 110
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/DislikeListView;->access$100(Lcom/bytedance/sdk/openadsdk/DislikeListView;)Lcom/bykv/vk/openvk/api/proto/EventListener;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {}, Lcom/bykv/a/a/a/a/a;->a()Lcom/bykv/a/a/a/a/a;

    .line 115
    .line 116
    .line 117
    move-result-object p4

    .line 118
    invoke-virtual {p4, p1}, Lcom/bykv/a/a/a/a/a;->c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/a;->f()Lcom/bykv/vk/openvk/api/proto/Result;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-interface {p2, p3, p1}, Lcom/bykv/vk/openvk/api/proto/EventListener;->onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 127
    .line 128
    .line 129
    :cond_1
    return-void

    .line 130
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 131
    .line 132
    const-string p2, "adapter\u6570\u636e\u5f02\u5e38\uff0c\u5fc5\u987b\u4e3aFilterWord"

    .line 133
    .line 134
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1
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
.end method
