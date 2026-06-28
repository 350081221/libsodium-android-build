.class public Lorg/greenrobot/greendao/query/m$c;
.super Lorg/greenrobot/greendao/query/m$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/greenrobot/greendao/query/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field protected final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/greenrobot/greendao/query/m$a;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/greenrobot/greendao/query/m$c;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 3
    invoke-direct {p0, p2}, Lorg/greenrobot/greendao/query/m$a;-><init>(Ljava/lang/Object;)V

    .line 4
    iput-object p1, p0, Lorg/greenrobot/greendao/query/m$c;->d:Ljava/lang/String;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 5
    invoke-direct {p0, p2}, Lorg/greenrobot/greendao/query/m$a;-><init>([Ljava/lang/Object;)V

    .line 6
    iput-object p1, p0, Lorg/greenrobot/greendao/query/m$c;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 0

    iget-object p2, p0, Lorg/greenrobot/greendao/query/m$c;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
