.class final Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->sendData(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

.field final synthetic f:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    iput-object p2, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->f:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->b(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)Lcom/efs/sdk/base/EfsReporter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/efs/sdk/base/protocol/record/EfsJSONLog;

    .line 11
    .line 12
    const-string v1, "nativeh5perf"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/efs/sdk/base/protocol/record/EfsJSONLog;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "wk_native_h5log"

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->f:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/efs/sdk/base/protocol/record/AbsRecordLog;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->b(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)Lcom/efs/sdk/base/EfsReporter;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v0}, Lcom/efs/sdk/base/EfsReporter;->send(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    .line 32
    .line 33
    .line 34
    return-void
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
.end method
