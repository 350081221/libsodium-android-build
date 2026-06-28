.class Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;
.super Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;
.source "SourceFile"

# interfaces
.implements Landroidx/media/MediaBrowserServiceCompatApi23$ServiceCompatProxy;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x17
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MediaBrowserServiceImplApi23"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media/MediaBrowserServiceCompat;


# direct methods
.method constructor <init>(Landroidx/media/MediaBrowserServiceCompat;)V
    .locals 0

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    invoke-direct {p0, p1}, Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroidx/media/MediaBrowserServiceCompatApi23;->createService(Landroid/content/Context;Landroidx/media/MediaBrowserServiceCompatApi23$ServiceCompatProxy;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi21;->mServiceObj:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/media/MediaBrowserServiceCompatApi21;->onCreate(Ljava/lang/Object;)V

    .line 10
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
.end method

.method public onLoadItem(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompatApi21$ResultWrapper;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/MediaBrowserServiceCompatApi21$ResultWrapper<",
            "Landroid/os/Parcel;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1;-><init>(Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;Ljava/lang/Object;Landroidx/media/MediaBrowserServiceCompatApi21$ResultWrapper;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Landroidx/media/MediaBrowserServiceCompat$MediaBrowserServiceImplApi23;->this$0:Landroidx/media/MediaBrowserServiceCompat;

    .line 7
    .line 8
    invoke-virtual {p2, p1, v0}, Landroidx/media/MediaBrowserServiceCompat;->onLoadItem(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$Result;)V

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
