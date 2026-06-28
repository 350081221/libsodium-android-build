.class final Landroidx/emoji2/viewsintegration/EmojiKeyListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/method/KeyListener;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x13
.end annotation

.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/viewsintegration/EmojiKeyListener$EmojiCompatHandleKeyDownHelper;
    }
.end annotation


# instance fields
.field private final mEmojiCompatHandleKeyDownHelper:Landroidx/emoji2/viewsintegration/EmojiKeyListener$EmojiCompatHandleKeyDownHelper;

.field private final mKeyListener:Landroid/text/method/KeyListener;


# direct methods
.method constructor <init>(Landroid/text/method/KeyListener;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/emoji2/viewsintegration/EmojiKeyListener$EmojiCompatHandleKeyDownHelper;

    invoke-direct {v0}, Landroidx/emoji2/viewsintegration/EmojiKeyListener$EmojiCompatHandleKeyDownHelper;-><init>()V

    invoke-direct {p0, p1, v0}, Landroidx/emoji2/viewsintegration/EmojiKeyListener;-><init>(Landroid/text/method/KeyListener;Landroidx/emoji2/viewsintegration/EmojiKeyListener$EmojiCompatHandleKeyDownHelper;)V

    return-void
.end method

.method constructor <init>(Landroid/text/method/KeyListener;Landroidx/emoji2/viewsintegration/EmojiKeyListener$EmojiCompatHandleKeyDownHelper;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/emoji2/viewsintegration/EmojiKeyListener;->mKeyListener:Landroid/text/method/KeyListener;

    .line 4
    iput-object p2, p0, Landroidx/emoji2/viewsintegration/EmojiKeyListener;->mEmojiCompatHandleKeyDownHelper:Landroidx/emoji2/viewsintegration/EmojiKeyListener$EmojiCompatHandleKeyDownHelper;

    return-void
.end method


# virtual methods
.method public clearMetaKeyState(Landroid/view/View;Landroid/text/Editable;I)V
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/viewsintegration/EmojiKeyListener;->mKeyListener:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/KeyListener;->clearMetaKeyState(Landroid/view/View;Landroid/text/Editable;I)V

    return-void
.end method

.method public getInputType()I
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/viewsintegration/EmojiKeyListener;->mKeyListener:Landroid/text/method/KeyListener;

    invoke-interface {v0}, Landroid/text/method/KeyListener;->getInputType()I

    move-result v0

    return v0
.end method

.method public onKeyDown(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/viewsintegration/EmojiKeyListener;->mEmojiCompatHandleKeyDownHelper:Landroidx/emoji2/viewsintegration/EmojiKeyListener$EmojiCompatHandleKeyDownHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p3, p4}, Landroidx/emoji2/viewsintegration/EmojiKeyListener$EmojiCompatHandleKeyDownHelper;->handleKeyDown(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/emoji2/viewsintegration/EmojiKeyListener;->mKeyListener:Landroid/text/method/KeyListener;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/method/KeyListener;->onKeyDown(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    :goto_1
    return p1
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
.end method

.method public onKeyOther(Landroid/view/View;Landroid/text/Editable;Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/viewsintegration/EmojiKeyListener;->mKeyListener:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/KeyListener;->onKeyOther(Landroid/view/View;Landroid/text/Editable;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onKeyUp(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/viewsintegration/EmojiKeyListener;->mKeyListener:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/method/KeyListener;->onKeyUp(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
