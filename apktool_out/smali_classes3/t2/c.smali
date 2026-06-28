.class public final synthetic Lt2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lt2/f;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lt2/f;Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/c;->a:Lt2/f;

    iput-object p2, p0, Lt2/c;->b:Landroid/content/Context;

    iput-object p3, p0, Lt2/c;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lt2/c;->a:Lt2/f;

    iget-object v1, p0, Lt2/c;->b:Landroid/content/Context;

    iget-object v2, p0, Lt2/c;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lt2/f;->j(Lt2/f;Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
