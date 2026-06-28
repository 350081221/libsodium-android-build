.class Landroidx/core/splashscreen/SplashScreen$Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/splashscreen/SplashScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Impl"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008C\u0010DJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0008\u001a\u00020\u0006H\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0004J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015R\u0017\u0010\u0019\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u0010%\u001a\u0004\u0008+\u0010\'\"\u0004\u0008,\u0010)R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010-\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\"\u00109\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010B\u00a8\u0006E"
    }
    d2 = {
        "Landroidx/core/splashscreen/SplashScreen$Impl;",
        "",
        "Landroid/view/View;",
        "splashScreenView",
        "Landroid/graphics/drawable/Drawable;",
        "icon",
        "Lkotlin/r2;",
        "displaySplashScreenIcon",
        "install",
        "Landroid/content/res/Resources$Theme;",
        "Landroid/content/res/Resources;",
        "currentTheme",
        "Landroid/util/TypedValue;",
        "typedValue",
        "setPostSplashScreenTheme",
        "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;",
        "keepOnScreenCondition",
        "setKeepOnScreenCondition",
        "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;",
        "exitAnimationListener",
        "setOnExitAnimationListener",
        "Landroidx/core/splashscreen/SplashScreenViewProvider;",
        "splashScreenViewProvider",
        "dispatchOnExitAnimation",
        "Landroid/app/Activity;",
        "activity",
        "Landroid/app/Activity;",
        "getActivity",
        "()Landroid/app/Activity;",
        "",
        "finalThemeId",
        "I",
        "getFinalThemeId",
        "()I",
        "setFinalThemeId",
        "(I)V",
        "backgroundResId",
        "Ljava/lang/Integer;",
        "getBackgroundResId",
        "()Ljava/lang/Integer;",
        "setBackgroundResId",
        "(Ljava/lang/Integer;)V",
        "backgroundColor",
        "getBackgroundColor",
        "setBackgroundColor",
        "Landroid/graphics/drawable/Drawable;",
        "getIcon",
        "()Landroid/graphics/drawable/Drawable;",
        "setIcon",
        "(Landroid/graphics/drawable/Drawable;)V",
        "",
        "hasBackground",
        "Z",
        "getHasBackground",
        "()Z",
        "setHasBackground",
        "(Z)V",
        "splashScreenWaitPredicate",
        "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;",
        "getSplashScreenWaitPredicate",
        "()Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;",
        "setSplashScreenWaitPredicate",
        "(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V",
        "animationListener",
        "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;",
        "mSplashScreenViewProvider",
        "Landroidx/core/splashscreen/SplashScreenViewProvider;",
        "<init>",
        "(Landroid/app/Activity;)V",
        "core-splashscreen_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final activity:Landroid/app/Activity;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private animationListener:Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private backgroundColor:Ljava/lang/Integer;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private backgroundResId:Ljava/lang/Integer;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private finalThemeId:I

.field private hasBackground:Z

.field private icon:Landroid/graphics/drawable/Drawable;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private mSplashScreenViewProvider:Landroidx/core/splashscreen/SplashScreenViewProvider;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private splashScreenWaitPredicate:Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->activity:Landroid/app/Activity;

    .line 10
    .line 11
    new-instance p1, Landroidx/core/splashscreen/b;

    .line 12
    .line 13
    invoke-direct {p1}, Landroidx/core/splashscreen/b;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->splashScreenWaitPredicate:Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic a(Landroidx/core/splashscreen/SplashScreenViewProvider;Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/splashscreen/SplashScreen$Impl;->dispatchOnExitAnimation$lambda-3(Landroidx/core/splashscreen/SplashScreenViewProvider;Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V

    return-void
.end method

.method public static final synthetic access$getMSplashScreenViewProvider$p(Landroidx/core/splashscreen/SplashScreen$Impl;)Landroidx/core/splashscreen/SplashScreenViewProvider;
    .locals 0

    iget-object p0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->mSplashScreenViewProvider:Landroidx/core/splashscreen/SplashScreenViewProvider;

    return-object p0
.end method

.method public static final synthetic access$setMSplashScreenViewProvider$p(Landroidx/core/splashscreen/SplashScreen$Impl;Landroidx/core/splashscreen/SplashScreenViewProvider;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->mSplashScreenViewProvider:Landroidx/core/splashscreen/SplashScreenViewProvider;

    return-void
.end method

.method public static synthetic b()Z
    .locals 1

    invoke-static {}, Landroidx/core/splashscreen/SplashScreen$Impl;->splashScreenWaitPredicate$lambda-0()Z

    move-result v0

    return v0
.end method

.method private static final dispatchOnExitAnimation$lambda-3(Landroidx/core/splashscreen/SplashScreenViewProvider;Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V
    .locals 1

    .line 1
    const-string v0, "$splashScreenViewProvider"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$finalListener"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/core/splashscreen/SplashScreenViewProvider;->getView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p0}, Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;->onSplashScreenExit(Landroidx/core/splashscreen/SplashScreenViewProvider;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method private final displaySplashScreenIcon(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    sget v0, Landroidx/core/splashscreen/R$id;->splashscreen_icon_view:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/widget/ImageView;

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->hasBackground:Z

    .line 10
    .line 11
    const v1, 0x3f2aaaab

    .line 12
    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget v2, Landroidx/core/splashscreen/R$drawable;->icon_background:I

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget v3, Landroidx/core/splashscreen/R$dimen;->splashscreen_icon_size_with_background:I

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    mul-float/2addr v2, v1

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v1, Landroidx/core/splashscreen/MaskedDrawable;

    .line 40
    .line 41
    invoke-direct {v1, v0, v2}, Landroidx/core/splashscreen/MaskedDrawable;-><init>(Landroid/graphics/drawable/Drawable;F)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget v2, Landroidx/core/splashscreen/R$dimen;->splashscreen_icon_size_no_background:I

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    mul-float v2, v0, v1

    .line 59
    .line 60
    :cond_1
    :goto_0
    new-instance v0, Landroidx/core/splashscreen/MaskedDrawable;

    .line 61
    .line 62
    invoke-direct {v0, p2, v2}, Landroidx/core/splashscreen/MaskedDrawable;-><init>(Landroid/graphics/drawable/Drawable;F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 66
    .line 67
    .line 68
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
.end method

.method private static final splashScreenWaitPredicate$lambda-0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final dispatchOnExitAnimation(Landroidx/core/splashscreen/SplashScreenViewProvider;)V
    .locals 3
    .param p1    # Landroidx/core/splashscreen/SplashScreenViewProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "splashScreenViewProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->animationListener:Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->animationListener:Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/core/splashscreen/SplashScreenViewProvider;->getView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Landroidx/core/splashscreen/a;

    .line 19
    .line 20
    invoke-direct {v2, p1, v0}, Landroidx/core/splashscreen/a;-><init>(Landroidx/core/splashscreen/SplashScreenViewProvider;Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method

.method public final getActivity()Landroid/app/Activity;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method public final getBackgroundColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->backgroundColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBackgroundResId()Ljava/lang/Integer;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->backgroundResId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getFinalThemeId()I
    .locals 1

    iget v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->finalThemeId:I

    return v0
.end method

.method public final getHasBackground()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->hasBackground:Z

    return v0
.end method

.method public final getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->icon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getSplashScreenWaitPredicate()Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->splashScreenWaitPredicate:Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;

    return-object v0
.end method

.method public install()V
    .locals 5

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->activity:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget v2, Landroidx/core/splashscreen/R$attr;->windowSplashScreenBackground:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iput-object v2, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->backgroundResId:Ljava/lang/Integer;

    .line 28
    .line 29
    iget v2, v0, Landroid/util/TypedValue;->data:I

    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iput-object v2, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->backgroundColor:Ljava/lang/Integer;

    .line 36
    .line 37
    :cond_0
    sget v2, Landroidx/core/splashscreen/R$attr;->windowSplashScreenAnimatedIcon:I

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/content/res/Resources$Theme;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->icon:Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    :cond_1
    sget v2, Landroidx/core/splashscreen/R$attr;->splashScreenIconSize:I

    .line 54
    .line 55
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    .line 62
    .line 63
    sget v4, Landroidx/core/splashscreen/R$dimen;->splashscreen_icon_size_with_background:I

    .line 64
    .line 65
    if-ne v2, v4, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/4 v3, 0x0

    .line 69
    :goto_0
    iput-boolean v3, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->hasBackground:Z

    .line 70
    .line 71
    :cond_3
    const-string v2, "currentTheme"

    .line 72
    .line 73
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1, v0}, Landroidx/core/splashscreen/SplashScreen$Impl;->setPostSplashScreenTheme(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V

    .line 77
    .line 78
    .line 79
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final setBackgroundColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->backgroundColor:Ljava/lang/Integer;

    return-void
.end method

.method public final setBackgroundResId(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->backgroundResId:Ljava/lang/Integer;

    return-void
.end method

.method public final setFinalThemeId(I)V
    .locals 0

    iput p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->finalThemeId:I

    return-void
.end method

.method public final setHasBackground(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->hasBackground:Z

    return-void
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->icon:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setKeepOnScreenCondition(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V
    .locals 2
    .param p1    # Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "keepOnScreenCondition"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->splashScreenWaitPredicate:Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->activity:Landroid/app/Activity;

    .line 9
    .line 10
    const v0, 0x1020002

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Landroidx/core/splashscreen/SplashScreen$Impl$setKeepOnScreenCondition$1;

    .line 22
    .line 23
    invoke-direct {v1, p0, p1}, Landroidx/core/splashscreen/SplashScreen$Impl$setKeepOnScreenCondition$1;-><init>(Landroidx/core/splashscreen/SplashScreen$Impl;Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 27
    .line 28
    .line 29
    return-void
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
.end method

.method public setOnExitAnimationListener(Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V
    .locals 4
    .param p1    # Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "exitAnimationListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->animationListener:Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;

    .line 7
    .line 8
    new-instance p1, Landroidx/core/splashscreen/SplashScreenViewProvider;

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->activity:Landroid/app/Activity;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Landroidx/core/splashscreen/SplashScreenViewProvider;-><init>(Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->backgroundResId:Ljava/lang/Integer;

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->backgroundColor:Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/core/splashscreen/SplashScreenViewProvider;->getView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->activity:Landroid/app/Activity;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    iget-object v0, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->icon:Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    invoke-direct {p0, v2, v0}, Landroidx/core/splashscreen/SplashScreen$Impl;->displaySplashScreenIcon(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    new-instance v0, Landroidx/core/splashscreen/SplashScreen$Impl$setOnExitAnimationListener$2;

    .line 74
    .line 75
    invoke-direct {v0, p0, p1}, Landroidx/core/splashscreen/SplashScreen$Impl$setOnExitAnimationListener$2;-><init>(Landroidx/core/splashscreen/SplashScreen$Impl;Landroidx/core/splashscreen/SplashScreenViewProvider;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 79
    .line 80
    .line 81
    return-void
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

.method protected final setPostSplashScreenTheme(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V
    .locals 2
    .param p1    # Landroid/content/res/Resources$Theme;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/util/TypedValue;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "currentTheme"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "typedValue"

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget v0, Landroidx/core/splashscreen/R$attr;->postSplashScreenTheme:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p1, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget p1, p2, Landroid/util/TypedValue;->resourceId:I

    .line 22
    .line 23
    iput p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->finalThemeId:I

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p2, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->activity:Landroid/app/Activity;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Landroid/app/Activity;->setTheme(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
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
.end method

.method public final setSplashScreenWaitPredicate(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V
    .locals 1
    .param p1    # Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/core/splashscreen/SplashScreen$Impl;->splashScreenWaitPredicate:Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;

    .line 7
    .line 8
    return-void
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
.end method
