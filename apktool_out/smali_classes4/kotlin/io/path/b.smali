.class public final enum Lkotlin/io/path/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/io/path/b;",
        ">;"
    }
.end annotation

.annotation build Lkotlin/g1;
    version = "1.8"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lkotlin/io/path/CopyActionResult;",
        "",
        "(Ljava/lang/String;I)V",
        "CONTINUE",
        "SKIP_SUBTREE",
        "TERMINATE",
        "kotlin-stdlib-jdk7"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/io/path/o;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/a;

.field private static final synthetic $VALUES:[Lkotlin/io/path/b;

.field public static final enum CONTINUE:Lkotlin/io/path/b;

.field public static final enum SKIP_SUBTREE:Lkotlin/io/path/b;

.field public static final enum TERMINATE:Lkotlin/io/path/b;


# direct methods
.method private static final synthetic $values()[Lkotlin/io/path/b;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/io/path/b;

    const/4 v1, 0x0

    sget-object v2, Lkotlin/io/path/b;->CONTINUE:Lkotlin/io/path/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lkotlin/io/path/b;->SKIP_SUBTREE:Lkotlin/io/path/b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lkotlin/io/path/b;->TERMINATE:Lkotlin/io/path/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkotlin/io/path/b;

    .line 2
    .line 3
    const-string v1, "CONTINUE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lkotlin/io/path/b;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lkotlin/io/path/b;->CONTINUE:Lkotlin/io/path/b;

    .line 10
    .line 11
    new-instance v0, Lkotlin/io/path/b;

    .line 12
    .line 13
    const-string v1, "SKIP_SUBTREE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lkotlin/io/path/b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lkotlin/io/path/b;->SKIP_SUBTREE:Lkotlin/io/path/b;

    .line 20
    .line 21
    new-instance v0, Lkotlin/io/path/b;

    .line 22
    .line 23
    const-string v1, "TERMINATE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lkotlin/io/path/b;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lkotlin/io/path/b;->TERMINATE:Lkotlin/io/path/b;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/io/path/b;->$values()[Lkotlin/io/path/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lkotlin/io/path/b;->$VALUES:[Lkotlin/io/path/b;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/enums/b;->b([Ljava/lang/Enum;)Lkotlin/enums/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lkotlin/io/path/b;->$ENTRIES:Lkotlin/enums/a;

    .line 42
    .line 43
    return-void
    .line 44
    .line 45
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/a<",
            "Lkotlin/io/path/b;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lkotlin/io/path/b;->$ENTRIES:Lkotlin/enums/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/io/path/b;
    .locals 1

    const-class v0, Lkotlin/io/path/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/io/path/b;

    return-object p0
.end method

.method public static values()[Lkotlin/io/path/b;
    .locals 1

    sget-object v0, Lkotlin/io/path/b;->$VALUES:[Lkotlin/io/path/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/io/path/b;

    return-object v0
.end method
