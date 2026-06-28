.class public Lcom/ss/android/downloadad/api/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/downloadad/api/a/a;


# instance fields
.field private A:I

.field private B:J

.field private C:J

.field private D:J

.field private E:I

.field private F:I

.field private G:Ljava/lang/String;

.field private H:Z

.field private I:Ljava/lang/String;

.field private J:Z

.field private K:Z

.field private L:Z

.field private M:Ljava/lang/String;

.field private N:Ljava/lang/String;

.field private O:Z

.field private P:Z

.field private Q:I

.field private R:I
    .annotation build Lcom/ss/android/downloadad/api/constant/AdBaseConstants$FunnelType;
    .end annotation
.end field

.field private S:J

.field private T:J

.field private U:Z

.field private V:Z

.field private W:Ljava/lang/String;

.field private X:Z

.field private Y:Z

.field private Z:Z

.field protected a:Z

.field private aa:J

.field private transient ab:Z

.field private ac:Z

.field private ad:Z

.field private ae:Z

.field private af:Z

.field private ag:Z

.field private ah:Z

.field private ai:Ljava/lang/String;

.field private aj:J

.field protected b:Z

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private f:J

.field private g:J

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Z

.field private v:J

.field private w:Lorg/json/JSONObject;

.field private x:I

.field private y:Z

.field private z:I


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/ss/android/downloadad/api/a/b;->i:I

    .line 3
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->u:Z

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->y:Z

    .line 5
    iput v1, p0, Lcom/ss/android/downloadad/api/a/b;->z:I

    .line 6
    iput v1, p0, Lcom/ss/android/downloadad/api/a/b;->A:I

    .line 7
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->H:Z

    .line 8
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->J:Z

    .line 9
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->K:Z

    .line 10
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->L:Z

    .line 11
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->a:Z

    .line 12
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->b:Z

    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    iput v0, p0, Lcom/ss/android/downloadad/api/a/b;->R:I

    .line 17
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->U:Z

    const-wide/16 v0, -0x1

    .line 18
    iput-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->aa:J

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ss/android/downloadad/api/a/b;-><init>(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;I)V

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;I)V
    .locals 3

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 21
    iput v0, p0, Lcom/ss/android/downloadad/api/a/b;->i:I

    .line 22
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->u:Z

    const/4 v1, 0x0

    .line 23
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->y:Z

    .line 24
    iput v1, p0, Lcom/ss/android/downloadad/api/a/b;->z:I

    .line 25
    iput v1, p0, Lcom/ss/android/downloadad/api/a/b;->A:I

    .line 26
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->H:Z

    .line 27
    iput-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->J:Z

    .line 28
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->K:Z

    .line 29
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->L:Z

    .line 30
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->a:Z

    .line 31
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->b:Z

    .line 32
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    iput v0, p0, Lcom/ss/android/downloadad/api/a/b;->R:I

    .line 36
    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->U:Z

    const-wide/16 v0, -0x1

    .line 37
    iput-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->aa:J

    .line 38
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->f:J

    .line 39
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getExtraValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->g:J

    .line 40
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->h:Ljava/lang/String;

    .line 41
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->j:Ljava/lang/String;

    .line 42
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getExtra()Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->w:Lorg/json/JSONObject;

    .line 43
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->isAd()Z

    move-result v0

    iput-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->u:Z

    .line 44
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getVersionCode()I

    move-result v0

    iput v0, p0, Lcom/ss/android/downloadad/api/a/b;->q:I

    .line 45
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getVersionName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->r:Ljava/lang/String;

    .line 46
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->k:Ljava/lang/String;

    .line 47
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 48
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/download/api/model/DeepLink;->getOpenUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->l:Ljava/lang/String;

    .line 49
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDeepLink()Lcom/ss/android/download/api/model/DeepLink;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/download/api/model/DeepLink;->getWebUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->m:Ljava/lang/String;

    .line 50
    :cond_0
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getModelType()I

    move-result v0

    iput v0, p0, Lcom/ss/android/downloadad/api/a/b;->n:I

    .line 51
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->s:Ljava/lang/String;

    .line 52
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getAppIcon()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->t:Ljava/lang/String;

    .line 53
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getMimeType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->I:Ljava/lang/String;

    .line 54
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadEventConfig;->getClickButtonTag()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->M:Ljava/lang/String;

    .line 55
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadEventConfig;->getRefer()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->N:Ljava/lang/String;

    .line 56
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadEventConfig;->isEnableV3Event()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/a/b;->O:Z

    .line 57
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->isEnableBackDialog()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/a/b;->y:Z

    .line 58
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->getLinkMode()I

    move-result p2

    iput p2, p0, Lcom/ss/android/downloadad/api/a/b;->o:I

    .line 59
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result p2

    iput p2, p0, Lcom/ss/android/downloadad/api/a/b;->p:I

    .line 60
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->enableShowComplianceDialog()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/a/b;->U:Z

    .line 61
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->isAutoDownloadOnCardShow()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/a/b;->V:Z

    .line 62
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->enableNewActivity()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/a/b;->K:Z

    .line 63
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->enableAH()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/a/b;->a:Z

    .line 64
    invoke-interface {p3}, Lcom/ss/android/download/api/download/DownloadController;->enableAM()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/a/b;->b:Z

    .line 65
    iput p4, p0, Lcom/ss/android/downloadad/api/a/b;->x:I

    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/ss/android/downloadad/api/a/b;->v:J

    .line 67
    iput-wide p2, p0, Lcom/ss/android/downloadad/api/a/b;->B:J

    .line 68
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->shouldDownloadWithPatchApply()Z

    move-result p2

    iput-boolean p2, p0, Lcom/ss/android/downloadad/api/a/b;->J:Z

    .line 69
    instance-of p2, p1, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz p2, :cond_1

    .line 70
    check-cast p1, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getTaskKey()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->ai:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public static b(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/a/b;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/ss/android/downloadad/api/a/b;

    invoke-direct {v0}, Lcom/ss/android/downloadad/api/a/b;-><init>()V

    :try_start_0
    const-string v1, "mId"

    .line 7
    invoke-static {p0, v1}, Lcom/ss/android/download/api/c/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/a/b;->d(J)V

    const-string v1, "mExtValue"

    .line 8
    invoke-static {p0, v1}, Lcom/ss/android/download/api/c/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/a/b;->e(J)V

    const-string v1, "mLogExtra"

    .line 9
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->c(Ljava/lang/String;)V

    const-string v1, "mDownloadStatus"

    .line 10
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->e(I)V

    const-string v1, "mPackageName"

    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->b(Ljava/lang/String;)V

    const-string v1, "mIsAd"

    const/4 v2, 0x1

    .line 12
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->a(Z)V

    const-string v1, "mTimeStamp"

    .line 13
    invoke-static {p0, v1}, Lcom/ss/android/download/api/c/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/ss/android/downloadad/api/a/b;->f(J)V

    const-string v1, "mVersionCode"

    .line 14
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->f(I)V

    const-string v1, "mVersionName"

    .line 15
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->d(Ljava/lang/String;)V

    const-string v1, "mDownloadId"

    .line 16
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->g(I)V

    const-string v1, "mIsV3Event"

    .line 17
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->b(Z)V

    const-string v1, "mScene"

    .line 18
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->h(I)V

    const-string v1, "mEventTag"

    .line 19
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->f(Ljava/lang/String;)V

    const-string v1, "mEventRefer"

    .line 20
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->g(Ljava/lang/String;)V

    const-string v1, "mDownloadUrl"

    .line 21
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->h(Ljava/lang/String;)V

    const-string v1, "mEnableBackDialog"

    .line 22
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->c(Z)V

    .line 23
    iget-object v1, v0, Lcom/ss/android/downloadad/api/a/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v3, "hasSendInstallFinish"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 24
    iget-object v1, v0, Lcom/ss/android/downloadad/api/a/b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v3, "hasSendDownloadFailedFinally"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 25
    iget-object v1, v0, Lcom/ss/android/downloadad/api/a/b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v3, "hasDoRebootMarketInstallFinishCheck"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string v1, "mLastFailedErrCode"

    .line 26
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->d(I)V

    const-string v1, "mLastFailedErrMsg"

    .line 27
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->a(Ljava/lang/String;)V

    const-string v1, "mOpenUrl"

    .line 28
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->i(Ljava/lang/String;)V

    const-string v1, "mLinkMode"

    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->j(I)V

    const-string v1, "mDownloadMode"

    .line 30
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->k(I)V

    const-string v1, "mModelType"

    .line 31
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->l(I)V

    const-string v1, "mAppName"

    .line 32
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->j(Ljava/lang/String;)V

    const-string v1, "mAppIcon"

    .line 33
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->k(Ljava/lang/String;)V

    const-string v1, "mDownloadFailedTimes"

    const/4 v3, 0x0

    .line 34
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->a(I)V

    const-string v1, "mRecentDownloadResumeTime"

    .line 35
    invoke-static {p0, v1}, Lcom/ss/android/download/api/c/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/a/b;->a(J)V

    const-string v1, "mClickPauseTimes"

    .line 36
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->b(I)V

    const-string v1, "mJumpInstallTime"

    .line 37
    invoke-static {p0, v1}, Lcom/ss/android/download/api/c/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/a/b;->b(J)V

    const-string v1, "mCancelInstallTime"

    .line 38
    invoke-static {p0, v1}, Lcom/ss/android/download/api/c/b;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/a/b;->c(J)V

    const-string v1, "mLastFailedResumeCount"

    .line 39
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->c(I)V

    const-string v1, "downloadFinishReason"

    .line 40
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->l(Ljava/lang/String;)V

    const-string v1, "clickDownloadSize"

    .line 41
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/a/b;->i(J)V

    const-string v1, "clickDownloadTime"

    .line 42
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/downloadad/api/a/b;->h(J)V

    const-string v1, "mIsUpdateDownload"

    .line 43
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->h(Z)V

    const-string v1, "mOriginMimeType"

    .line 44
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->m(Ljava/lang/String;)V

    const-string v1, "mIsPatchApplyHandled"

    .line 45
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->i(Z)V

    const-string v1, "installAfterCleanSpace"

    .line 46
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->f(Z)V

    const-string v1, "funnelType"

    .line 47
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->i(I)V

    const-string v1, "webUrl"

    .line 48
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->e(Ljava/lang/String;)V

    const-string v1, "enableShowComplianceDialog"

    .line 49
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->p(Z)V

    const-string v1, "isAutoDownloadOnCardShow"

    .line 50
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->q(Z)V

    const-string v1, "enable_new_activity"

    .line 51
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v2, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->r(Z)V

    const-string v1, "enable_pause"

    .line 52
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v2, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->s(Z)V

    const-string v1, "enable_ah"

    .line 53
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v2, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    move v1, v3

    :goto_2
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->t(Z)V

    const-string v1, "enable_am"

    .line 54
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    move v2, v3

    :goto_3
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadad/api/a/b;->u(Z)V

    const-string v1, "mExtras"

    .line 55
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->a(Lorg/json/JSONObject;)V

    const-string v1, "intent_jump_browser_success"

    .line 56
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->v(Z)V

    const-string v1, "task_key"

    .line 57
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->n(Ljava/lang/String;)V

    const-string v1, "market_install_finish_check_start_timestamp"

    .line 58
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/a/b;->j(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p0

    .line 59
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->u()Lcom/ss/android/download/api/b/a;

    move-result-object v1

    const-string v2, "NativeDownloadModel fromJson"

    invoke-interface {v1, p0, v2}, Lcom/ss/android/download/api/b/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_4
    return-object v0
.end method


# virtual methods
.method public declared-synchronized A()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->A:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/ss/android/downloadad/api/a/b;->A:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    monitor-exit p0

    .line 12
    throw v0
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
.end method

.method public B()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->B:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->v:J

    .line 10
    .line 11
    :cond_0
    return-wide v0
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
.end method

.method public C()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->C:J

    return-wide v0
.end method

.method public D()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->E:I

    return v0
.end method

.method public E()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->F:I

    return v0
.end method

.method public F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->G:Ljava/lang/String;

    return-object v0
.end method

.method public G()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->i:I

    return v0
.end method

.method public H()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->v:J

    return-wide v0
.end method

.method public I()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->q:I

    return v0
.end method

.method public J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->r:Ljava/lang/String;

    return-object v0
.end method

.method public K()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->Q:I

    return v0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->y:Z

    return v0
.end method

.method public M()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->aa:J

    return-wide v0
.end method

.method public N()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->s:Ljava/lang/String;

    return-object v0
.end method

.method public O()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->o:I

    return v0
.end method

.method public P()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->W:Ljava/lang/String;

    return-object v0
.end method

.method public Q()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->Y:Z

    return v0
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->P:Z

    return v0
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->Z:Z

    return v0
.end method

.method public T()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->S:J

    return-wide v0
.end method

.method public U()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->T:J

    return-wide v0
.end method

.method public V()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->H:Z

    return v0
.end method

.method public W()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->I:Ljava/lang/String;

    return-object v0
.end method

.method public X()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->J:Z

    return v0
.end method

.method public Y()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->ab:Z

    return v0
.end method

.method public Z()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->ac:Z

    return v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->k:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->z:I

    return-void
.end method

.method public a(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->B:J

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->G:Ljava/lang/String;

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->w:Lorg/json/JSONObject;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->u:Z

    return-void
.end method

.method public aa()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->ae:Z

    return v0
.end method

.method public ab()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->ad:Z

    return v0
.end method

.method public ac()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->af:Z

    return v0
.end method

.method public ad()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->ag:Z

    return v0
.end method

.method public ae()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->ah:Z

    return v0
.end method

.method public af()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->ai:Ljava/lang/String;

    return-object v0
.end method

.method public ag()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->aj:J

    return-wide v0
.end method

.method public ah()Lorg/json/JSONObject;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "mId"

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->f:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "mExtValue"

    .line 14
    .line 15
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->g:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "mLogExtra"

    .line 21
    .line 22
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->h:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v1, "mDownloadStatus"

    .line 28
    .line 29
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->i:I

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v1, "mPackageName"

    .line 35
    .line 36
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->j:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v1, "mIsAd"

    .line 42
    .line 43
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->u:Z

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v1, "mTimeStamp"

    .line 49
    .line 50
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->v:J

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    const-string v1, "mExtras"

    .line 56
    .line 57
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->w:Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v1, "mVersionCode"

    .line 63
    .line 64
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->q:I

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    const-string v1, "mVersionName"

    .line 70
    .line 71
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->r:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    const-string v1, "mDownloadId"

    .line 77
    .line 78
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->x:I

    .line 79
    .line 80
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    const-string v1, "mIsV3Event"

    .line 84
    .line 85
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->O:Z

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    const-string v1, "mScene"

    .line 91
    .line 92
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->Q:I

    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    const-string v1, "mEventTag"

    .line 98
    .line 99
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->M:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    const-string v1, "mEventRefer"

    .line 105
    .line 106
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->N:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    const-string v1, "mDownloadUrl"

    .line 112
    .line 113
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->k:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    .line 117
    .line 118
    const-string v1, "mEnableBackDialog"

    .line 119
    .line 120
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->y:Z

    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    const-string v1, "hasSendInstallFinish"

    .line 126
    .line 127
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 134
    .line 135
    .line 136
    const-string v1, "hasSendDownloadFailedFinally"

    .line 137
    .line 138
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    const-string v1, "hasDoRebootMarketInstallFinishCheck"

    .line 148
    .line 149
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    const-string v1, "mLastFailedErrCode"

    .line 159
    .line 160
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->F:I

    .line 161
    .line 162
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    const-string v1, "mLastFailedErrMsg"

    .line 166
    .line 167
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->G:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    const-string v1, "mOpenUrl"

    .line 173
    .line 174
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->l:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 177
    .line 178
    .line 179
    const-string v1, "mLinkMode"

    .line 180
    .line 181
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->o:I

    .line 182
    .line 183
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 184
    .line 185
    .line 186
    const-string v1, "mDownloadMode"

    .line 187
    .line 188
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->p:I

    .line 189
    .line 190
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    const-string v1, "mModelType"

    .line 194
    .line 195
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->n:I

    .line 196
    .line 197
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 198
    .line 199
    .line 200
    const-string v1, "mAppName"

    .line 201
    .line 202
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->s:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 205
    .line 206
    .line 207
    const-string v1, "mAppIcon"

    .line 208
    .line 209
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->t:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    const-string v1, "mDownloadFailedTimes"

    .line 215
    .line 216
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->z:I

    .line 217
    .line 218
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 219
    .line 220
    .line 221
    const-string v1, "mRecentDownloadResumeTime"

    .line 222
    .line 223
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->B:J

    .line 224
    .line 225
    const-wide/16 v4, 0x0

    .line 226
    .line 227
    cmp-long v4, v2, v4

    .line 228
    .line 229
    if-nez v4, :cond_0

    .line 230
    .line 231
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->v:J

    .line 232
    .line 233
    :cond_0
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 234
    .line 235
    .line 236
    const-string v1, "mClickPauseTimes"

    .line 237
    .line 238
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->A:I

    .line 239
    .line 240
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 241
    .line 242
    .line 243
    const-string v1, "mJumpInstallTime"

    .line 244
    .line 245
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->C:J

    .line 246
    .line 247
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 248
    .line 249
    .line 250
    const-string v1, "mCancelInstallTime"

    .line 251
    .line 252
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->D:J

    .line 253
    .line 254
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 255
    .line 256
    .line 257
    const-string v1, "mLastFailedResumeCount"

    .line 258
    .line 259
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->E:I

    .line 260
    .line 261
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 262
    .line 263
    .line 264
    const-string v1, "mIsUpdateDownload"

    .line 265
    .line 266
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->H:Z

    .line 267
    .line 268
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 269
    .line 270
    .line 271
    const-string v1, "mOriginMimeType"

    .line 272
    .line 273
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->I:Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 276
    .line 277
    .line 278
    const-string v1, "mIsPatchApplyHandled"

    .line 279
    .line 280
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->J:Z

    .line 281
    .line 282
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 283
    .line 284
    .line 285
    const-string v1, "downloadFinishReason"

    .line 286
    .line 287
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->W:Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 290
    .line 291
    .line 292
    const-string v1, "clickDownloadTime"

    .line 293
    .line 294
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->S:J

    .line 295
    .line 296
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 297
    .line 298
    .line 299
    const-string v1, "clickDownloadSize"

    .line 300
    .line 301
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->T:J

    .line 302
    .line 303
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 304
    .line 305
    .line 306
    const-string v1, "installAfterCleanSpace"

    .line 307
    .line 308
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->P:Z

    .line 309
    .line 310
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 311
    .line 312
    .line 313
    const-string v1, "funnelType"

    .line 314
    .line 315
    iget v2, p0, Lcom/ss/android/downloadad/api/a/b;->R:I

    .line 316
    .line 317
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 318
    .line 319
    .line 320
    const-string v1, "webUrl"

    .line 321
    .line 322
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->m:Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 325
    .line 326
    .line 327
    const-string v1, "enableShowComplianceDialog"

    .line 328
    .line 329
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->U:Z

    .line 330
    .line 331
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 332
    .line 333
    .line 334
    const-string v1, "isAutoDownloadOnCardShow"

    .line 335
    .line 336
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->V:Z

    .line 337
    .line 338
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 339
    .line 340
    .line 341
    const-string v1, "enable_new_activity"

    .line 342
    .line 343
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->K:Z

    .line 344
    .line 345
    const/4 v3, 0x1

    .line 346
    const/4 v4, 0x0

    .line 347
    if-eqz v2, :cond_1

    .line 348
    .line 349
    move v2, v3

    .line 350
    goto :goto_0

    .line 351
    :cond_1
    move v2, v4

    .line 352
    :goto_0
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 353
    .line 354
    .line 355
    const-string v1, "enable_pause"

    .line 356
    .line 357
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->L:Z

    .line 358
    .line 359
    if-eqz v2, :cond_2

    .line 360
    .line 361
    move v2, v3

    .line 362
    goto :goto_1

    .line 363
    :cond_2
    move v2, v4

    .line 364
    :goto_1
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 365
    .line 366
    .line 367
    const-string v1, "enable_ah"

    .line 368
    .line 369
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->a:Z

    .line 370
    .line 371
    if-eqz v2, :cond_3

    .line 372
    .line 373
    move v2, v3

    .line 374
    goto :goto_2

    .line 375
    :cond_3
    move v2, v4

    .line 376
    :goto_2
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 377
    .line 378
    .line 379
    const-string v1, "enable_am"

    .line 380
    .line 381
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->b:Z

    .line 382
    .line 383
    if-eqz v2, :cond_4

    .line 384
    .line 385
    goto :goto_3

    .line 386
    :cond_4
    move v3, v4

    .line 387
    :goto_3
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 388
    .line 389
    .line 390
    const-string v1, "intent_jump_browser_success"

    .line 391
    .line 392
    iget-boolean v2, p0, Lcom/ss/android/downloadad/api/a/b;->ah:Z

    .line 393
    .line 394
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 399
    .line 400
    .line 401
    const-string v1, "task_key"

    .line 402
    .line 403
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->ai:Ljava/lang/String;

    .line 404
    .line 405
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 406
    .line 407
    .line 408
    const-string v1, "market_install_finish_check_start_timestamp"

    .line 409
    .line 410
    iget-wide v2, p0, Lcom/ss/android/downloadad/api/a/b;->aj:J

    .line 411
    .line 412
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 417
    .line 418
    .line 419
    goto :goto_4

    .line 420
    :catch_0
    move-exception v1

    .line 421
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->u()Lcom/ss/android/download/api/b/a;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    const-string v3, "NativeDownloadModel toJson"

    .line 426
    .line 427
    invoke-interface {v2, v1, v3}, Lcom/ss/android/download/api/b/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    :goto_4
    return-object v0
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public ai()Lcom/ss/android/downloadad/api/download/AdDownloadModel;
    .locals 5

    .line 1
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lcom/ss/android/downloadad/api/a/b;->f:J

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAdId(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-wide v1, p0, Lcom/ss/android/downloadad/api/a/b;->g:J

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setExtraValue(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->h:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setLogExtra(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->j:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setPackageName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->w:Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setExtra(Lorg/json/JSONObject;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->u:Z

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setIsAd(Z)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v1, p0, Lcom/ss/android/downloadad/api/a/b;->q:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setVersionCode(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->r:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setVersionName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->k:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDownloadUrl(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget v1, p0, Lcom/ss/android/downloadad/api/a/b;->n:I

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setModelType(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->I:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setMimeType(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->s:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppName(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->t:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setAppIcon(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->ai:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setTaskKey(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v1, Lcom/ss/android/download/api/model/DeepLink;

    .line 91
    .line 92
    iget-object v2, p0, Lcom/ss/android/downloadad/api/a/b;->l:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v3, p0, Lcom/ss/android/downloadad/api/a/b;->m:Ljava/lang/String;

    .line 95
    .line 96
    const/4 v4, 0x0

    .line 97
    invoke-direct {v1, v2, v3, v4}, Lcom/ss/android/download/api/model/DeepLink;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->setDeepLink(Lcom/ss/android/download/api/model/DeepLink;)Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0
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
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public aj()Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->M:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setClickButtonTag(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/ss/android/downloadad/api/a/b;->N:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setRefer(Ljava/lang/String;)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->O:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->setIsEnableV3Event(Z)Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
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
.end method

.method public ak()Lcom/ss/android/downloadad/api/download/AdDownloadController;
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->y:Z

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setIsEnableBackDialog(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, p0, Lcom/ss/android/downloadad/api/a/b;->o:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setLinkMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, p0, Lcom/ss/android/downloadad/api/a/b;->p:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setDownloadMode(I)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->U:Z

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableShowComplianceDialog(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->a:Z

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAH(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-boolean v1, p0, Lcom/ss/android/downloadad/api/a/b;->b:Z

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->setEnableAM(Z)Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadController$Builder;->build()Lcom/ss/android/downloadad/api/download/AdDownloadController;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
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
.end method

.method public b()J
    .locals 2

    .line 3
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->f:J

    return-wide v0
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->A:I

    return-void
.end method

.method public b(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->C:J

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->j:Ljava/lang/String;

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->O:Z

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->E:I

    return-void
.end method

.method public c(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->D:J

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->h:Ljava/lang/String;

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->y:Z

    return-void
.end method

.method public c()Z
    .locals 1

    .line 4
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->u:Z

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->F:I

    return-void
.end method

.method public d(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->f:J

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->r:Ljava/lang/String;

    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->X:Z

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->j:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->i:I

    return-void
.end method

.method public e(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->g:J

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->m:Ljava/lang/String;

    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->Y:Z

    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->l:Ljava/lang/String;

    return-object v0
.end method

.method public f(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->q:I

    return-void
.end method

.method public f(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 1
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->v:J

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->M:Ljava/lang/String;

    return-void
.end method

.method public f(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->P:Z

    return-void
.end method

.method public g()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->w:Lorg/json/JSONObject;

    return-object v0
.end method

.method public g(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->x:I

    return-void
.end method

.method public g(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->aa:J

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->N:Ljava/lang/String;

    return-void
.end method

.method public g(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->Z:Z

    return-void
.end method

.method public h()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->R:I

    return v0
.end method

.method public h(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->Q:I

    return-void
.end method

.method public h(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->S:J

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->k:Ljava/lang/String;

    return-void
.end method

.method public h(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->H:Z

    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->N:Ljava/lang/String;

    return-object v0
.end method

.method public i(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->R:I

    return-void
.end method

.method public i(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->T:J

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->l:Ljava/lang/String;

    return-void
.end method

.method public i(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->J:Z

    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadad/api/a/b;->M:Ljava/lang/String;

    return-object v0
.end method

.method public j(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->o:I

    return-void
.end method

.method public j(J)V
    .locals 0

    .line 5
    iput-wide p1, p0, Lcom/ss/android/downloadad/api/a/b;->aj:J

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->s:Ljava/lang/String;

    return-void
.end method

.method public j(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->ab:Z

    return-void
.end method

.method public k()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public k(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->p:I

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->t:Ljava/lang/String;

    return-void
.end method

.method public k(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->ac:Z

    return-void
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadad/api/a/b;->g:J

    return-wide v0
.end method

.method public l(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadad/api/a/b;->n:I

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->W:Ljava/lang/String;

    return-void
.end method

.method public l(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->ae:Z

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->I:Ljava/lang/String;

    return-void
.end method

.method public m(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->ad:Z

    return-void
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->O:Z

    return v0
.end method

.method public n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadad/api/a/b;->ai:Ljava/lang/String;

    return-void
.end method

.method public n(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->af:Z

    return-void
.end method

.method public o()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public o(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->ag:Z

    return-void
.end method

.method public p()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public p(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->U:Z

    return-void
.end method

.method public q(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->V:Z

    return-void
.end method

.method public q()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/ss/android/downloadad/api/a/b;->K:Z

    return v0
.end method

.method public r()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->K:Z

    return-void
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->x:I

    return v0
.end method

.method public s(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->L:Z

    return-void
.end method

.method public t()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public t(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->a:Z

    return-void
.end method

.method public u()Lcom/ss/android/download/api/download/DownloadModel;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/a/b;->ai()Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    move-result-object v0

    return-object v0
.end method

.method public u(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->b:Z

    return-void
.end method

.method public v()Lcom/ss/android/download/api/download/DownloadEventConfig;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/a/b;->aj()Lcom/ss/android/downloadad/api/download/AdDownloadEventConfig;

    move-result-object v0

    return-object v0
.end method

.method public v(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadad/api/a/b;->ah:Z

    return-void
.end method

.method public w()Lcom/ss/android/download/api/download/DownloadController;
    .locals 1

    invoke-virtual {p0}, Lcom/ss/android/downloadad/api/a/b;->ak()Lcom/ss/android/downloadad/api/download/AdDownloadController;

    move-result-object v0

    return-object v0
.end method

.method public x()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->z:I

    return v0
.end method

.method public declared-synchronized y()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->z:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/ss/android/downloadad/api/a/b;->z:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    monitor-exit p0

    .line 12
    throw v0
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
.end method

.method public z()I
    .locals 1

    iget v0, p0, Lcom/ss/android/downloadad/api/a/b;->A:I

    return v0
.end method
