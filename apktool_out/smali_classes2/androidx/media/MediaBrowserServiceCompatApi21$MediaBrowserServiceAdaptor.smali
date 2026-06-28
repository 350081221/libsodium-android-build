.class Landroidx/media/MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor;
.super Landroid/service/media/MediaBrowserService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompatApi21;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaBrowserServiceAdaptor"
.end annotation


# instance fields
.field final mServiceProxy:Landroidx/media/MediaBrowserServiceCompatApi21$ServiceCompatProxy;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroidx/media/MediaBrowserServiceCompatApi21$ServiceCompatProxy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/service/media/MediaBrowserService;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Landroidx/media/MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor;->mServiceProxy:Landroidx/media/MediaBrowserServiceCompatApi21$ServiceCompatProxy;

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


# virtual methods
.method public onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroid/service/media/MediaBrowserService$BrowserRoot;
    .locals 3

    .line 1
    invoke-static {p3}, Landroid/support/v4/media/session/MediaSessionCompat;->ensureClassLoader(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor;->mServiceProxy:Landroidx/media/MediaBrowserServiceCompatApi21$ServiceCompatProxy;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v2, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {v0, p1, p2, v2}, Landroidx/media/MediaBrowserServiceCompatApi21$ServiceCompatProxy;->onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroidx/media/MediaBrowserServiceCompatApi21$BrowserRoot;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    new-instance v1, Landroid/service/media/MediaBrowserService$BrowserRoot;

    .line 24
    .line 25
    iget-object p2, p1, Landroidx/media/MediaBrowserServiceCompatApi21$BrowserRoot;->mRootId:Ljava/lang/String;

    .line 26
    .line 27
    iget-object p1, p1, Landroidx/media/MediaBrowserServiceCompatApi21$BrowserRoot;->mExtras:Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-direct {v1, p2, p1}, Landroid/service/media/MediaBrowserService$BrowserRoot;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    :goto_1
    return-object v1
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
.end method

.method public onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/service/media/MediaBrowserService$Result<",
            "Ljava/util/List<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor;->mServiceProxy:Landroidx/media/MediaBrowserServiceCompatApi21$ServiceCompatProxy;

    new-instance v1, Landroidx/media/MediaBrowserServiceCompatApi21$ResultWrapper;

    invoke-direct {v1, p2}, Landroidx/media/MediaBrowserServiceCompatApi21$ResultWrapper;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    invoke-interface {v0, p1, v1}, Landroidx/media/MediaBrowserServiceCompatApi21$ServiceCompatProxy;->onLoadChildren(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompatApi21$ResultWrapper;)V

    return-void
.end method
