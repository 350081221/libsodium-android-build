.class public Lcom/umeng/analytics/pro/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SdCardPath"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/e$a;,
        Lcom/umeng/analytics/pro/e$b;,
        Lcom/umeng/analytics/pro/e$c;,
        Lcom/umeng/analytics/pro/e$d;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "subprocess/"

.field public static final b:Ljava/lang/String;

.field public static final c:I = 0x2

.field public static final d:Ljava/lang/String; = "id"

.field public static final e:Ljava/lang/String; = "INTEGER"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/umeng/analytics/pro/au;->b()Lcom/umeng/analytics/pro/au;

    move-result-object v0

    const-string v1, "ua"

    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/au;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/analytics/pro/e;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
