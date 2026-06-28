.class public Lcom/huawei/agconnect/apms/custom/TraceMeasure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/huawei/agconnect/apms/custom/TraceMeasure;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public abc:Ljava/lang/String;

.field public bcd:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/apms/custom/TraceMeasure$abc;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/custom/TraceMeasure$abc;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/agconnect/apms/custom/TraceMeasure$abc;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->abc:Ljava/lang/String;

    .line 6
    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p2, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->bcd:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->abc:Ljava/lang/String;

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->bcd:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public abc()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->abc:Ljava/lang/String;

    return-object v0
.end method

.method public abc(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->bcd:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    return-void
.end method

.method public bcd()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->bcd:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public bcd(J)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->bcd:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->abc:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/huawei/agconnect/apms/custom/TraceMeasure;->bcd:Ljava/util/concurrent/atomic/AtomicLong;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 13
    .line 14
    .line 15
    return-void
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
    .line 28
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
.end method
