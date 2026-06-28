.class public Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEFAULT_PREFERENCE:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/umeng/analytics/pro/au;->b()Lcom/umeng/analytics/pro/au;

    move-result-object v0

    const-string v1, "ugc"

    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/au;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->DEFAULT_PREFERENCE:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    if-eqz p0, :cond_0

    sget-object v0, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->DEFAULT_PREFERENCE:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
