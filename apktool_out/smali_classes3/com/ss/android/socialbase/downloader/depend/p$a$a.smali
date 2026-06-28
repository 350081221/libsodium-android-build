.class Lcom/ss/android/socialbase/downloader/depend/p$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/depend/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/depend/p$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field public static a:Lcom/ss/android/socialbase/downloader/depend/p;


# instance fields
.field private b:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/depend/p$a$a;->b:Landroid/os/IBinder;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method


# virtual methods
.method public a(JJLcom/ss/android/socialbase/downloader/depend/o;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    :try_start_0
    const-string v0, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler"

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p3, p4}, Landroid/os/Parcel;->writeLong(J)V

    .line 18
    .line 19
    .line 20
    if-eqz p5, :cond_0

    .line 21
    .line 22
    invoke-interface {p5}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/depend/p$a$a;->b:Landroid/os/IBinder;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v8, 0x1

    .line 35
    invoke-interface {v0, v8, v1, v2, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-static {}, Lcom/ss/android/socialbase/downloader/depend/p$a;->a()Lcom/ss/android/socialbase/downloader/depend/p;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-static {}, Lcom/ss/android/socialbase/downloader/depend/p$a;->a()Lcom/ss/android/socialbase/downloader/depend/p;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    move-wide v4, p1

    .line 52
    move-wide v6, p3

    .line 53
    move-object v8, p5

    .line 54
    invoke-interface/range {v3 .. v8}, Lcom/ss/android/socialbase/downloader/depend/p;->a(JJLcom/ss/android/socialbase/downloader/depend/o;)Z

    .line 55
    .line 56
    .line 57
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 62
    .line 63
    .line 64
    return v0

    .line 65
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Landroid/os/Parcel;->readException()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 69
    .line 70
    .line 71
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    move v3, v8

    .line 75
    :cond_2
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 79
    .line 80
    .line 81
    return v3

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 87
    .line 88
    .line 89
    throw v0
    .line 90
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/depend/p$a$a;->b:Landroid/os/IBinder;

    return-object v0
.end method
