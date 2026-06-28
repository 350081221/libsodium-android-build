.class public abstract Lorg/greenrobot/greendao/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final daoConfigMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/greenrobot/greendao/a<",
            "**>;>;",
            "Lorg/greenrobot/greendao/internal/a;",
            ">;"
        }
    .end annotation
.end field

.field protected final db:Lorg/greenrobot/greendao/database/a;

.field protected final schemaVersion:I


# direct methods
.method public constructor <init>(Lorg/greenrobot/greendao/database/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/greenrobot/greendao/b;->db:Lorg/greenrobot/greendao/database/a;

    .line 5
    .line 6
    iput p2, p0, Lorg/greenrobot/greendao/b;->schemaVersion:I

    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lorg/greenrobot/greendao/b;->daoConfigMap:Ljava/util/Map;

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
.end method


# virtual methods
.method public getDatabase()Lorg/greenrobot/greendao/database/a;
    .locals 1

    iget-object v0, p0, Lorg/greenrobot/greendao/b;->db:Lorg/greenrobot/greendao/database/a;

    return-object v0
.end method

.method public getSchemaVersion()I
    .locals 1

    iget v0, p0, Lorg/greenrobot/greendao/b;->schemaVersion:I

    return v0
.end method

.method public abstract newSession()Lorg/greenrobot/greendao/c;
.end method

.method public abstract newSession(Lo4/d;)Lorg/greenrobot/greendao/c;
.end method

.method protected registerDaoClass(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/greenrobot/greendao/a<",
            "**>;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/greenrobot/greendao/internal/a;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/greenrobot/greendao/b;->db:Lorg/greenrobot/greendao/database/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lorg/greenrobot/greendao/internal/a;-><init>(Lorg/greenrobot/greendao/database/a;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lorg/greenrobot/greendao/b;->daoConfigMap:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method
