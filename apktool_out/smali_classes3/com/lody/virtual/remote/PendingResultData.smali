.class public Lcom/lody/virtual/remote/PendingResultData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/remote/PendingResultData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public mAbortBroadcast:Z

.field public mFinished:Z

.field public mFlags:I

.field public mInitialStickyHint:Z

.field public mOrderedHint:Z

.field public mResultCode:I

.field public mResultData:Ljava/lang/String;

.field public mResultExtras:Landroid/os/Bundle;

.field public mSendingUser:I

.field public mToken:Landroid/os/IBinder;

.field public mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/remote/PendingResultData$1;

    invoke-direct {v0}, Lcom/lody/virtual/remote/PendingResultData$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/remote/PendingResultData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->ctor:Lmirror/RefConstructor;

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mType:Lmirror/RefInt;

    invoke-virtual {v0, p1}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mType:I

    .line 4
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mOrderedHint:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mOrderedHint:Z

    .line 5
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mInitialStickyHint:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mInitialStickyHint:Z

    .line 6
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mToken:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mToken:Landroid/os/IBinder;

    .line 7
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mSendingUser:Lmirror/RefInt;

    invoke-virtual {v0, p1}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mSendingUser:I

    .line 8
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mFlags:Lmirror/RefInt;

    invoke-virtual {v0, p1}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mFlags:I

    .line 9
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mResultCode:Lmirror/RefInt;

    invoke-virtual {v0, p1}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultCode:I

    .line 10
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mResultData:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultData:Ljava/lang/String;

    .line 11
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mResultExtras:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultExtras:Landroid/os/Bundle;

    .line 12
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mAbortBroadcast:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mAbortBroadcast:Z

    .line 13
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->mFinished:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/lody/virtual/remote/PendingResultData;->mFinished:Z

    goto/16 :goto_0

    .line 14
    :cond_0
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->ctor:Lmirror/RefConstructor;

    if-eqz v0, :cond_1

    .line 15
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mType:Lmirror/RefInt;

    invoke-virtual {v0, p1}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mType:I

    .line 16
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mOrderedHint:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mOrderedHint:Z

    .line 17
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mInitialStickyHint:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mInitialStickyHint:Z

    .line 18
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mToken:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mToken:Landroid/os/IBinder;

    .line 19
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mSendingUser:Lmirror/RefInt;

    invoke-virtual {v0, p1}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mSendingUser:I

    .line 20
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mResultCode:Lmirror/RefInt;

    invoke-virtual {v0, p1}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultCode:I

    .line 21
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mResultData:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultData:Ljava/lang/String;

    .line 22
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mResultExtras:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultExtras:Landroid/os/Bundle;

    .line 23
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mAbortBroadcast:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mAbortBroadcast:Z

    .line 24
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->mFinished:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/lody/virtual/remote/PendingResultData;->mFinished:Z

    goto :goto_0

    .line 25
    :cond_1
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->mType:Lmirror/RefInt;

    invoke-virtual {v0, p1}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mType:I

    .line 26
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->mOrderedHint:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mOrderedHint:Z

    .line 27
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->mInitialStickyHint:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mInitialStickyHint:Z

    .line 28
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->mToken:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mToken:Landroid/os/IBinder;

    .line 29
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->mResultCode:Lmirror/RefInt;

    invoke-virtual {v0, p1}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultCode:I

    .line 30
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->mResultData:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultData:Ljava/lang/String;

    .line 31
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->mResultExtras:Lmirror/RefObject;

    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultExtras:Landroid/os/Bundle;

    .line 32
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->mAbortBroadcast:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mAbortBroadcast:Z

    .line 33
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->mFinished:Lmirror/RefBoolean;

    invoke-virtual {v0, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/lody/virtual/remote/PendingResultData;->mFinished:Z

    :goto_0
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mType:I

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mOrderedHint:Z

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mInitialStickyHint:Z

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mToken:Landroid/os/IBinder;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mSendingUser:I

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mFlags:I

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultCode:I

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultData:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultExtras:Landroid/os/Bundle;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    iput-boolean v0, p0, Lcom/lody/virtual/remote/PendingResultData;->mAbortBroadcast:Z

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    move v1, v2

    :goto_3
    iput-boolean v1, p0, Lcom/lody/virtual/remote/PendingResultData;->mFinished:Z

    return-void
.end method


# virtual methods
.method public build()Landroid/content/BroadcastReceiver$PendingResult;
    .locals 12

    .line 1
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultMNC;->ctor:Lmirror/RefConstructor;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/4 v3, 0x6

    .line 7
    const/4 v4, 0x5

    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x3

    .line 10
    const/4 v7, 0x2

    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v9, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/16 v10, 0x9

    .line 16
    .line 17
    new-array v10, v10, [Ljava/lang/Object;

    .line 18
    .line 19
    iget v11, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultCode:I

    .line 20
    .line 21
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v11

    .line 25
    aput-object v11, v10, v9

    .line 26
    .line 27
    iget-object v9, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultData:Ljava/lang/String;

    .line 28
    .line 29
    aput-object v9, v10, v8

    .line 30
    .line 31
    iget-object v8, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultExtras:Landroid/os/Bundle;

    .line 32
    .line 33
    aput-object v8, v10, v7

    .line 34
    .line 35
    iget v7, p0, Lcom/lody/virtual/remote/PendingResultData;->mType:I

    .line 36
    .line 37
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    aput-object v7, v10, v6

    .line 42
    .line 43
    iget-boolean v6, p0, Lcom/lody/virtual/remote/PendingResultData;->mOrderedHint:Z

    .line 44
    .line 45
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    aput-object v6, v10, v5

    .line 50
    .line 51
    iget-boolean v5, p0, Lcom/lody/virtual/remote/PendingResultData;->mInitialStickyHint:Z

    .line 52
    .line 53
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    aput-object v5, v10, v4

    .line 58
    .line 59
    iget-object v4, p0, Lcom/lody/virtual/remote/PendingResultData;->mToken:Landroid/os/IBinder;

    .line 60
    .line 61
    aput-object v4, v10, v3

    .line 62
    .line 63
    iget v3, p0, Lcom/lody/virtual/remote/PendingResultData;->mSendingUser:I

    .line 64
    .line 65
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    aput-object v3, v10, v2

    .line 70
    .line 71
    iget v2, p0, Lcom/lody/virtual/remote/PendingResultData;->mFlags:I

    .line 72
    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    aput-object v2, v10, v1

    .line 78
    .line 79
    invoke-virtual {v0, v10}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Landroid/content/BroadcastReceiver$PendingResult;

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_0
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResultJBMR1;->ctor:Lmirror/RefConstructor;

    .line 87
    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    new-array v1, v1, [Ljava/lang/Object;

    .line 91
    .line 92
    iget v10, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultCode:I

    .line 93
    .line 94
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    aput-object v10, v1, v9

    .line 99
    .line 100
    iget-object v9, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultData:Ljava/lang/String;

    .line 101
    .line 102
    aput-object v9, v1, v8

    .line 103
    .line 104
    iget-object v8, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultExtras:Landroid/os/Bundle;

    .line 105
    .line 106
    aput-object v8, v1, v7

    .line 107
    .line 108
    iget v7, p0, Lcom/lody/virtual/remote/PendingResultData;->mType:I

    .line 109
    .line 110
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    aput-object v7, v1, v6

    .line 115
    .line 116
    iget-boolean v6, p0, Lcom/lody/virtual/remote/PendingResultData;->mOrderedHint:Z

    .line 117
    .line 118
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    aput-object v6, v1, v5

    .line 123
    .line 124
    iget-boolean v5, p0, Lcom/lody/virtual/remote/PendingResultData;->mInitialStickyHint:Z

    .line 125
    .line 126
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    aput-object v5, v1, v4

    .line 131
    .line 132
    iget-object v4, p0, Lcom/lody/virtual/remote/PendingResultData;->mToken:Landroid/os/IBinder;

    .line 133
    .line 134
    aput-object v4, v1, v3

    .line 135
    .line 136
    iget v3, p0, Lcom/lody/virtual/remote/PendingResultData;->mSendingUser:I

    .line 137
    .line 138
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    aput-object v3, v1, v2

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Landroid/content/BroadcastReceiver$PendingResult;

    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_1
    sget-object v0, Lmirror/android/content/BroadcastReceiver$PendingResult;->ctor:Lmirror/RefConstructor;

    .line 152
    .line 153
    new-array v1, v2, [Ljava/lang/Object;

    .line 154
    .line 155
    iget v2, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultCode:I

    .line 156
    .line 157
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    aput-object v2, v1, v9

    .line 162
    .line 163
    iget-object v2, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultData:Ljava/lang/String;

    .line 164
    .line 165
    aput-object v2, v1, v8

    .line 166
    .line 167
    iget-object v2, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultExtras:Landroid/os/Bundle;

    .line 168
    .line 169
    aput-object v2, v1, v7

    .line 170
    .line 171
    iget v2, p0, Lcom/lody/virtual/remote/PendingResultData;->mType:I

    .line 172
    .line 173
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    aput-object v2, v1, v6

    .line 178
    .line 179
    iget-boolean v2, p0, Lcom/lody/virtual/remote/PendingResultData;->mOrderedHint:Z

    .line 180
    .line 181
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    aput-object v2, v1, v5

    .line 186
    .line 187
    iget-boolean v2, p0, Lcom/lody/virtual/remote/PendingResultData;->mInitialStickyHint:Z

    .line 188
    .line 189
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    aput-object v2, v1, v4

    .line 194
    .line 195
    iget-object v2, p0, Lcom/lody/virtual/remote/PendingResultData;->mToken:Landroid/os/IBinder;

    .line 196
    .line 197
    aput-object v2, v1, v3

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Landroid/content/BroadcastReceiver$PendingResult;

    .line 204
    .line 205
    return-object v0
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

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public finish()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/remote/PendingResultData;->build()Landroid/content/BroadcastReceiver$PendingResult;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    .line 12
    .line 13
    :goto_0
    return-void
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

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mType:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget-boolean p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mOrderedHint:Z

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 9
    .line 10
    .line 11
    iget-boolean p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mInitialStickyHint:Z

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mToken:Landroid/os/IBinder;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mSendingUser:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mFlags:I

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    iget p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultCode:I

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultData:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mResultExtras:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    iget-boolean p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mAbortBroadcast:Z

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 49
    .line 50
    .line 51
    iget-boolean p2, p0, Lcom/lody/virtual/remote/PendingResultData;->mFinished:Z

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 54
    .line 55
    .line 56
    return-void
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
    .line 107
    .line 108
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
.end method
