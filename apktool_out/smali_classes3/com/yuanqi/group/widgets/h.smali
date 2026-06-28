.class public Lcom/yuanqi/group/widgets/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/group/widgets/h$a;,
        Lcom/yuanqi/group/widgets/h$c;,
        Lcom/yuanqi/group/widgets/h$b;
    }
.end annotation


# static fields
.field public static final a:J = 0x26aL

.field public static final b:I

.field private static c:Ljava/lang/Long;

.field private static d:Ljava/lang/Long;

.field private static e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()J
    .locals 2

    invoke-static {}, Lcom/yuanqi/group/widgets/h;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic b()I
    .locals 1

    invoke-static {}, Lcom/yuanqi/group/widgets/h;->e()I

    move-result v0

    return v0
.end method

.method static synthetic c()J
    .locals 2

    invoke-static {}, Lcom/yuanqi/group/widgets/h;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(Landroid/app/Activity;Landroid/view/View;)Lcom/yuanqi/group/widgets/h$a;
    .locals 1

    new-instance v0, Lcom/yuanqi/group/widgets/h$a;

    invoke-direct {v0, p0, p1}, Lcom/yuanqi/group/widgets/h$a;-><init>(Landroid/app/Activity;Landroid/view/View;)V

    return-object v0
.end method

.method private static e()I
    .locals 1

    .line 1
    sget-object v0, Lcom/yuanqi/group/widgets/h;->e:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const v0, 0x106000b

    .line 11
    .line 12
    .line 13
    return v0
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

.method private static f()J
    .locals 2

    .line 1
    sget-object v0, Lcom/yuanqi/group/widgets/h;->d:Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x26a

    .line 11
    .line 12
    return-wide v0
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
.end method

.method private static g()J
    .locals 2

    .line 1
    sget-object v0, Lcom/yuanqi/group/widgets/h;->c:Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x26a

    .line 11
    .line 12
    return-wide v0
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
.end method

.method public static h(Landroid/view/View;)Lcom/yuanqi/group/widgets/h$c;
    .locals 2

    new-instance v0, Lcom/yuanqi/group/widgets/h$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/yuanqi/group/widgets/h$c;-><init>(Landroid/view/View;Z)V

    return-object v0
.end method

.method public static i(JJI)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sput-object p0, Lcom/yuanqi/group/widgets/h;->c:Ljava/lang/Long;

    .line 6
    .line 7
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sput-object p0, Lcom/yuanqi/group/widgets/h;->d:Ljava/lang/Long;

    .line 12
    .line 13
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sput-object p0, Lcom/yuanqi/group/widgets/h;->e:Ljava/lang/Integer;

    .line 18
    .line 19
    return-void
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
    .line 89
    .line 90
.end method

.method public static j(Landroid/view/View;)Lcom/yuanqi/group/widgets/h$c;
    .locals 2

    new-instance v0, Lcom/yuanqi/group/widgets/h$c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/yuanqi/group/widgets/h$c;-><init>(Landroid/view/View;Z)V

    return-object v0
.end method
