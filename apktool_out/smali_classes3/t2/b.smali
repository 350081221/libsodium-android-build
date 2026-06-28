.class public final synthetic Lt2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lt2/f;


# direct methods
.method public synthetic constructor <init>(Lt2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/b;->a:Lt2/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt2/b;->a:Lt2/f;

    invoke-static {v0}, Lt2/f;->i(Lt2/f;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
