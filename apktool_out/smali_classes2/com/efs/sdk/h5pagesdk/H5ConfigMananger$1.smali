.class final Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/base/observer/IConfigCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;


# direct methods
.method constructor <init>(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChange(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    const-string v0, "apm_native_h5perf_sampling_rate"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {v0, p1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;I)I

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;->e:Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {v0}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a(I)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {p1, v0}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    return-void
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
.end method
