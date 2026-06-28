.class Lorg/osmdroid/views/CustomZoomButtonsController$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/views/CustomZoomButtonsController;-><init>(Lorg/osmdroid/views/MapView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/osmdroid/views/CustomZoomButtonsController;


# direct methods
.method constructor <init>(Lorg/osmdroid/views/CustomZoomButtonsController;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController$2;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :catch_0
    :goto_0
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController$2;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/osmdroid/views/CustomZoomButtonsController;->access$400(Lorg/osmdroid/views/CustomZoomButtonsController;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lorg/osmdroid/views/CustomZoomButtonsController$2;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 8
    .line 9
    invoke-static {v2}, Lorg/osmdroid/views/CustomZoomButtonsController;->access$500(Lorg/osmdroid/views/CustomZoomButtonsController;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-long v2, v2

    .line 14
    add-long/2addr v0, v2

    .line 15
    iget-object v2, p0, Lorg/osmdroid/views/CustomZoomButtonsController$2;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 16
    .line 17
    invoke-static {v2}, Lorg/osmdroid/views/CustomZoomButtonsController;->access$600(Lorg/osmdroid/views/CustomZoomButtonsController;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sub-long/2addr v0, v2

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    cmp-long v2, v0, v2

    .line 25
    .line 26
    if-gtz v2, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController$2;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 29
    .line 30
    invoke-static {v0}, Lorg/osmdroid/views/CustomZoomButtonsController;->access$700(Lorg/osmdroid/views/CustomZoomButtonsController;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const/4 v2, 0x0

    .line 35
    :try_start_0
    invoke-static {v0, v1, v2}, Ljava/lang/Thread;->sleep(JI)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
