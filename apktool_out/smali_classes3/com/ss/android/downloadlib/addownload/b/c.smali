.class public Lcom/ss/android/downloadlib/addownload/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I = 0x0

.field public static b:I = 0x1

.field public static c:I = 0x2


# instance fields
.field private d:I

.field private e:J

.field private f:Lorg/json/JSONObject;

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/ss/android/downloadlib/addownload/b/c;->a:I

    .line 5
    .line 6
    iput v0, p0, Lcom/ss/android/downloadlib/addownload/b/c;->d:I

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/ss/android/downloadlib/addownload/b/c;->e:J

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/b/c;->f:Lorg/json/JSONObject;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lcom/ss/android/downloadlib/addownload/b/c;->g:I

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    .line 20
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/b/c;->h:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/b/c;->i:Ljava/lang/String;

    .line 23
    .line 24
    return-void
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


# virtual methods
.method public a(I)Lcom/ss/android/downloadlib/addownload/b/c;
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/b/c;->d:I

    return-object p0
.end method

.method public a()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/ss/android/downloadlib/addownload/b/c;->d:I

    sget v1, Lcom/ss/android/downloadlib/addownload/b/c;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadlib/addownload/b/c;->g:I

    return v0
.end method

.method public b(I)Lcom/ss/android/downloadlib/addownload/b/c;
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/b/c;->g:I

    return-object p0
.end method
