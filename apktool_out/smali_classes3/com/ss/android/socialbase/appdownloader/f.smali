.class public Lcom/ss/android/socialbase/appdownloader/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:Z

.field private B:I

.field private C:I

.field private D:Z

.field private E:Ljava/lang/String;

.field private F:Z

.field private G:Z

.field private H:Z

.field private I:Z

.field private J:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

.field private K:I

.field private L:I

.field private M:Z

.field private N:Lcom/ss/android/socialbase/downloader/depend/x;

.field private O:Lcom/ss/android/socialbase/downloader/depend/n;

.field private P:Lcom/ss/android/socialbase/appdownloader/c/e;

.field private Q:Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

.field private R:Lcom/ss/android/socialbase/downloader/depend/r;

.field private S:Z

.field private T:Lcom/ss/android/socialbase/downloader/depend/af;

.field private U:Z

.field private V:Lorg/json/JSONObject;

.field private W:Ljava/lang/String;

.field private X:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/m;",
            ">;"
        }
    .end annotation
.end field

.field private Y:I

.field private Z:J

.field private a:Landroid/app/Activity;

.field private aa:I

.field private ab:Z

.field private ac:Z

.field private ad:Ljava/lang/String;

.field private ae:Z

.field private af:Ljava/lang/String;

.field private ag:[I

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

.field private n:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Z

.field private r:Lcom/ss/android/socialbase/downloader/downloader/g;

.field private s:Lcom/ss/android/socialbase/downloader/downloader/h;

.field private t:Lcom/ss/android/socialbase/downloader/downloader/s;

.field private u:Lcom/ss/android/socialbase/downloader/notification/a;

.field private v:Z

.field private w:Z

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->i:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Lcom/ss/android/socialbase/appdownloader/f;->j:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->k:Z

    .line 11
    .line 12
    iput-boolean v1, p0, Lcom/ss/android/socialbase/appdownloader/f;->l:Z

    .line 13
    .line 14
    const-string v1, "application/vnd.android.package-archive"

    .line 15
    .line 16
    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/f;->p:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    iput v1, p0, Lcom/ss/android/socialbase/appdownloader/f;->B:I

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->F:Z

    .line 22
    .line 23
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_NONE:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 24
    .line 25
    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/f;->J:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 26
    .line 27
    const/16 v1, 0x96

    .line 28
    .line 29
    iput v1, p0, Lcom/ss/android/socialbase/appdownloader/f;->K:I

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->M:Z

    .line 32
    .line 33
    new-instance v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/f;->X:Ljava/util/List;

    .line 39
    .line 40
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->ac:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->ae:Z

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->b:Landroid/content/Context;

    .line 49
    .line 50
    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/f;->c:Ljava/lang/String;

    .line 51
    .line 52
    return-void
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


# virtual methods
.method public A()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->D:Z

    return v0
.end method

.method public B()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->E:Ljava/lang/String;

    return-object v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->F:Z

    return v0
.end method

.method public D()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->G:Z

    return v0
.end method

.method public E()Lcom/ss/android/socialbase/downloader/downloader/s;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->t:Lcom/ss/android/socialbase/downloader/downloader/s;

    return-object v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->K:I

    return v0
.end method

.method public G()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->L:I

    return v0
.end method

.method public H()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->H:Z

    return v0
.end method

.method public I()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->I:Z

    return v0
.end method

.method public J()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->M:Z

    return v0
.end method

.method public K()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->S:Z

    return v0
.end method

.method public L()Lcom/ss/android/socialbase/downloader/constants/EnqueueType;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->J:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    return-object v0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->A:Z

    return v0
.end method

.method public N()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->f:Ljava/lang/String;

    return-object v0
.end method

.method public O()Lcom/ss/android/socialbase/downloader/depend/x;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->N:Lcom/ss/android/socialbase/downloader/depend/x;

    return-object v0
.end method

.method public P()Lcom/ss/android/socialbase/downloader/depend/n;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->O:Lcom/ss/android/socialbase/downloader/depend/n;

    return-object v0
.end method

.method public Q()Lcom/ss/android/socialbase/appdownloader/c/e;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->P:Lcom/ss/android/socialbase/appdownloader/c/e;

    return-object v0
.end method

.method public R()Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->Q:Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    return-object v0
.end method

.method public S()Lcom/ss/android/socialbase/downloader/depend/af;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->T:Lcom/ss/android/socialbase/downloader/depend/af;

    return-object v0
.end method

.method public T()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->X:Ljava/util/List;

    return-object v0
.end method

.method public U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->ad:Ljava/lang/String;

    return-object v0
.end method

.method public V()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->U:Z

    return v0
.end method

.method public W()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->Y:I

    return v0
.end method

.method public X()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->Z:J

    return-wide v0
.end method

.method public Y()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->ae:Z

    return v0
.end method

.method public Z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->af:Ljava/lang/String;

    return-object v0
.end method

.method public a()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->a:Landroid/app/Activity;

    return-object v0
.end method

.method public a(J)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 7
    iput-wide p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->z:J

    return-object p0
.end method

.method public a(Lcom/ss/android/socialbase/downloader/constants/EnqueueType;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->J:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    return-object p0
.end method

.method public a(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->Q:Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    return-object p0
.end method

.method public a(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->m:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    return-object p0
.end method

.method public a(Lcom/ss/android/socialbase/downloader/depend/m;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 2

    .line 12
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->X:Ljava/util/List;

    monitor-enter v0

    if-eqz p1, :cond_1

    .line 13
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/f;->X:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/f;->X:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    monitor-exit v0

    return-object p0

    .line 16
    :cond_1
    :goto_0
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lcom/ss/android/socialbase/downloader/depend/r;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->R:Lcom/ss/android/socialbase/downloader/depend/r;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->e:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;)",
            "Lcom/ss/android/socialbase/appdownloader/f;"
        }
    .end annotation

    .line 4
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->h:Ljava/util/List;

    return-object p0
.end method

.method public a(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->V:Lorg/json/JSONObject;

    return-object p0
.end method

.method public a(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->i:Z

    return-object p0
.end method

.method public a(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->aa:I

    return-void
.end method

.method public aa()[I
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->ag:[I

    return-object v0
.end method

.method public ab()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->ab:Z

    return v0
.end method

.method public ac()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->ac:Z

    return v0
.end method

.method public ad()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->W:Ljava/lang/String;

    return-object v0
.end method

.method public ae()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->d:Ljava/util/List;

    return-object v0
.end method

.method public af()Lcom/ss/android/socialbase/downloader/depend/r;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->R:Lcom/ss/android/socialbase/downloader/depend/r;

    return-object v0
.end method

.method public ag()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->V:Lorg/json/JSONObject;

    return-object v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->b:Landroid/content/Context;

    return-object v0
.end method

.method public b(I)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->B:I

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->f:Ljava/lang/String;

    return-object p0
.end method

.method public b(Ljava/util/List;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ss/android/socialbase/appdownloader/f;"
        }
    .end annotation

    .line 5
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->d:Ljava/util/List;

    return-object p0
.end method

.method public b(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->j:Z

    return-object p0
.end method

.method public c(I)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->C:I

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->g:Ljava/lang/String;

    return-object p0
.end method

.method public c(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->l:Z

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->K:I

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->ad:Ljava/lang/String;

    return-object p0
.end method

.method public d(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->q:Z

    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->L:I

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->o:Ljava/lang/String;

    return-object p0
.end method

.method public e(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->v:Z

    return-object p0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->g:Ljava/lang/String;

    return-object v0
.end method

.method public f(I)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->Y:I

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->p:Ljava/lang/String;

    return-object p0
.end method

.method public f(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->w:Z

    return-object p0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->h:Ljava/util/List;

    return-object v0
.end method

.method public g(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->x:Ljava/lang/String;

    return-object p0
.end method

.method public g(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->D:Z

    return-object p0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->i:Z

    return v0
.end method

.method public h(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->y:Ljava/lang/String;

    return-object p0
.end method

.method public h(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->S:Z

    return-object p0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->j:Z

    return v0
.end method

.method public i(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->E:Ljava/lang/String;

    return-object p0
.end method

.method public i(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->F:Z

    return-object p0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->k:Z

    return v0
.end method

.method public j(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->af:Ljava/lang/String;

    return-object p0
.end method

.method public j(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->G:Z

    return-object p0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->l:Z

    return v0
.end method

.method public k(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->W:Ljava/lang/String;

    return-object p0
.end method

.method public k(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->H:Z

    return-object p0
.end method

.method public k()Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->m:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    return-object v0
.end method

.method public l(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->I:Z

    return-object p0
.end method

.method public l()Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->n:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    return-object v0
.end method

.method public m(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->M:Z

    return-object p0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->o:Ljava/lang/String;

    return-object v0
.end method

.method public n(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->A:Z

    return-object p0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->p:Ljava/lang/String;

    return-object v0
.end method

.method public o(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->ab:Z

    return-object p0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->q:Z

    return v0
.end method

.method public p(Z)Lcom/ss/android/socialbase/appdownloader/f;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/f;->ac:Z

    return-object p0
.end method

.method public p()Lcom/ss/android/socialbase/downloader/notification/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->u:Lcom/ss/android/socialbase/downloader/notification/a;

    return-object v0
.end method

.method public q()Lcom/ss/android/socialbase/downloader/downloader/h;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->s:Lcom/ss/android/socialbase/downloader/downloader/h;

    return-object v0
.end method

.method public r()Lcom/ss/android/socialbase/downloader/downloader/g;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->r:Lcom/ss/android/socialbase/downloader/downloader/g;

    return-object v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->v:Z

    return v0
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->w:Z

    return v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->aa:I

    return v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->x:Ljava/lang/String;

    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->y:Ljava/lang/String;

    return-object v0
.end method

.method public x()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->z:J

    return-wide v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->B:I

    return v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/f;->C:I

    return v0
.end method
