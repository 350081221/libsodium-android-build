.class final enum Lorg/osmdroid/views/overlay/milestones/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/views/overlay/milestones/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/osmdroid/views/overlay/milestones/g$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/osmdroid/views/overlay/milestones/g$a;

.field public static final enum STEP_ENDED:Lorg/osmdroid/views/overlay/milestones/g$a;

.field public static final enum STEP_INIT:Lorg/osmdroid/views/overlay/milestones/g$a;

.field public static final enum STEP_STARTED:Lorg/osmdroid/views/overlay/milestones/g$a;


# direct methods
.method private static synthetic $values()[Lorg/osmdroid/views/overlay/milestones/g$a;
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_INIT:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    sget-object v2, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_STARTED:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    sget-object v2, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_ENDED:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 16
    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 2
    .line 3
    const-string v1, "STEP_INIT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/osmdroid/views/overlay/milestones/g$a;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_INIT:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 10
    .line 11
    new-instance v0, Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 12
    .line 13
    const-string v1, "STEP_STARTED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lorg/osmdroid/views/overlay/milestones/g$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_STARTED:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 20
    .line 21
    new-instance v0, Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 22
    .line 23
    const-string v1, "STEP_ENDED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lorg/osmdroid/views/overlay/milestones/g$a;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lorg/osmdroid/views/overlay/milestones/g$a;->STEP_ENDED:Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 30
    .line 31
    invoke-static {}, Lorg/osmdroid/views/overlay/milestones/g$a;->$values()[Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lorg/osmdroid/views/overlay/milestones/g$a;->$VALUES:[Lorg/osmdroid/views/overlay/milestones/g$a;

    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
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

.method public static valueOf(Ljava/lang/String;)Lorg/osmdroid/views/overlay/milestones/g$a;
    .locals 1

    const-class v0, Lorg/osmdroid/views/overlay/milestones/g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/osmdroid/views/overlay/milestones/g$a;

    return-object p0
.end method

.method public static values()[Lorg/osmdroid/views/overlay/milestones/g$a;
    .locals 1

    sget-object v0, Lorg/osmdroid/views/overlay/milestones/g$a;->$VALUES:[Lorg/osmdroid/views/overlay/milestones/g$a;

    invoke-virtual {v0}, [Lorg/osmdroid/views/overlay/milestones/g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/osmdroid/views/overlay/milestones/g$a;

    return-object v0
.end method
