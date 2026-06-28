.class public final synthetic Lt2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lt2/i;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lt2/i;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/g;->a:Lt2/i;

    iput-object p2, p0, Lt2/g;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lt2/g;->a:Lt2/i;

    iget-object v1, p0, Lt2/g;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lt2/i;->a(Lt2/i;Ljava/lang/String;)Lcom/yuanqi/group/home/models/i;

    move-result-object v0

    return-object v0
.end method
