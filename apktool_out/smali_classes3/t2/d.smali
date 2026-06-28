.class public final synthetic Lt2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lt2/f;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lt2/f;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/d;->a:Lt2/f;

    iput-object p2, p0, Lt2/d;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lt2/d;->a:Lt2/f;

    iget-object v1, p0, Lt2/d;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lt2/f;->h(Lt2/f;Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
