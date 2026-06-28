.class Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field final synthetic c:I

.field final synthetic d:Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity;ZLcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->d:Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity;

    iput-boolean p2, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->a:Z

    iput-object p3, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iput p4, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->a:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setOnlyWifi(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->d:Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p2, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->pause(I)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Landroid/os/Handler;

    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    new-instance p2, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3$1;

    .line 36
    .line 37
    invoke-direct {p2, p0}, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3$1;-><init>(Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v0, 0x64

    .line 41
    .line 42
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->d:Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity;

    .line 47
    .line 48
    iget-object p2, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->b:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 49
    .line 50
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->c:I

    .line 51
    .line 52
    invoke-static {p1, p2, v0}, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity;->a(Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;I)V

    .line 53
    .line 54
    .line 55
    :goto_0
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity$3;->d:Lcom/ss/android/socialbase/appdownloader/view/DownloadTaskDeleteActivity;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 58
    .line 59
    .line 60
    return-void
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
