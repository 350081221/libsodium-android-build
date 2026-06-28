.class Lcom/umeng/analytics/process/UMProcessDBDatasSender$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/analytics/process/UMProcessDBDatasSender;->workEvent(Ljava/lang/Object;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/analytics/process/UMProcessDBDatasSender;


# direct methods
.method constructor <init>(Lcom/umeng/analytics/process/UMProcessDBDatasSender;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender$1;->a:Lcom/umeng/analytics/process/UMProcessDBDatasSender;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    const-string v0, "MobclickRT"

    .line 2
    .line 3
    const-string v1, "--->>> call processDBToMain start."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/umeng/analytics/process/UMProcessDBDatasSender$1;->a:Lcom/umeng/analytics/process/UMProcessDBDatasSender;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/umeng/analytics/process/UMProcessDBDatasSender;->access$000(Lcom/umeng/analytics/process/UMProcessDBDatasSender;)Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lcom/umeng/analytics/process/UMProcessDBHelper;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBHelper;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/umeng/analytics/process/UMProcessDBHelper;->processDBToMain()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method
